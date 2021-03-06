<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../css/bootstrap/bootstrap.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="../css/style.css">

<!-- Extra CSS -->
<link rel="stylesheet" href="https://unpkg.com/simplebar@latest/dist/simplebar.css"/>
<script src="https://kit.fontawesome.com/e907f1c9ed.js" crossorigin="anonymous"></script>

<title>Geslab 2.0</title>
<link rel="shortcut icon" type="image/png" href="../images/favicon.png"/>

</head>
<body>
	<%@page import="java.util.ArrayList"%>
	<%@page import="geslab.database.admin.*"%>
	<%@page import="geslab.database.user.*"%>
	<%
	Usuario usuario = (Usuario) request.getAttribute("usuario");
	String mensaje = (String) request.getAttribute("mensaje");
	ArrayList<Marca> marcas = (ArrayList<Marca>) request.getAttribute("marcas");
	ArrayList<Proveedor> proveedores = (ArrayList<Proveedor>) request.getAttribute("proveedores");
	%>
	<div class="container-fluid">
		<div class="container">
			<div class="row py-3 justify-content-between align-items-center">
				<div class="col-3">
					<img class="header__logo" src="../images/logo-geslab.svg">
				</div>
				
				<div class="col-3 pr-0 text-right header__menu">
						<div class="dropdown show">
						<a class="dropdown-toggle header__dropdown" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    <%=usuario.getNombre()%></a>
					
					  	<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
				  			<a class="dropdown-item header__dropdown-item" href="/index.do">Existencias</a>
				  			<a class="dropdown-item header__dropdown-item" href="/productos.do" >Productos</a>
				  			<a class="dropdown-item header__dropdown-item" href="/ubicaciones.do" >Ubicaciones</a>
				  			<a class="dropdown-item header__dropdown-item" href="/calidades.do" >Calidades</a>
<!-- 				  			<a class="dropdown-item header__dropdown-item" href="/marcas.do" >Marcas</a> -->
				  			<a class="dropdown-item header__dropdown-item" href="/proveedores.do" >Proveedores</a>
				  			<a class="dropdown-item header__dropdown-item--logout" href="/login.do?accion=logout" >Cerrar sesion</a>
					  	</div>
					</div>
				</div>
			</div>
			
			
			<div class="row pt-3" style="height: 83vh">
			
				<div class="col-3 pl-0 pr-3" id="columna-filtro" style="height: 100%">
					<div class="container filtros py-3" style="height: 100%">
						<div class="row px-2" data-simplebar data-simplebar-auto-hide="false" style="height: 85%">
							<div class="col-12" style="height: 100%">
								<p class="filtros__label">Nombre</p>
									<input class="filtros__input" id="filtro-nombre" type="text" onkeyup="filtrado()">
									
							</div>
						</div>
						<div class="row align-items-center justify-content-center" style="height: 15%">
							<div class="col px-4">
								<button type="button" class="btn filtros__boton" onclick="reiniciarFiltro()">Reiniciar filtro</button>
							</div>
						</div>
					</div>
				</div>
			

				<div class="col-9 pl-3 pr-0" id="columna-datos" style="height: 100%">
					
						
					<div id="fila-pesta�as" class="row mx-0 pb-2 align-items-center justify-content-between">
						<div class="col-4">
							<div class="row">
								<div class="col-6 px-0">
									<button id="bt-marcas" class="btn fila-pesta�as__pesta�a fila-pestanas__pestana--active">Marcas</button>
								</div>
								
							</div>
						</div>
					
					</div>
					
					
					
					<div class="col-12 container-info px-3">
						<div class="row pt-1 align-items-start" id="fila-tabla" style="height: 80%">
							<div class="col table-responsive" data-simplebar data-simplebar-auto-hide="false" style="height: 100%">
								
									<table id="tabla-marcas" class="table table-borderless table-hover table-sm">
										<thead >
										    <tr class="tabla-header">
										      <th class="tabla-header--item" scope="col">Nombre</th>
										      <th class="tabla-header--item" scope="col">Tlfn.</th>
										      <th class="tabla-header--item" scope="col">Direcci�n</th>
										      <th class="tabla-header--item" scope="col"></th>
										    </tr>
								  		</thead>
										
										 <tbody class="tabla-body">
											 	<%for (Marca m : marcas) {%>
											 		<tr data-fila=<%=m.getCodmarca()%>>
												    	<td class="tabla-body--row" id="nombre-<%=m.getCodmarca()%>"><%=m.getNombre()%></td>
												    	<td class="tabla-body--row" id="tlfn-<%=m.getCodmarca()%>"><%=m.getTelefono()%></td>
												    	<td class="tabla-body--row" id="direccion-<%=m.getCodmarca()%>"><%=m.getDireccion()%></td>
														
														<td class="tabla-body--row info" style="display: none">
													      	<select id="proveedores-<%=m.getCodmarca()%>">
										                    	<%for(String p: m.getProveedores()){%>
										                    		<option><%=p%></option>
										                    	<%}%>
				                    						</select>
													      </td>
														
														<%if(usuario.getRol() != Rol.USUARIO){ %>
													    	<td class="tabla-body--row info" style="text-align: right;">
													      		<button type="button" class="boton-tabla__accion" onclick="editar(<%=m.getCodmarca()%>)">
													      			<i class="fas fa-pen"></i></button></td>
												      	<%} %>
											    	</tr>
											 	<%} %>
									    </tbody>
									</table>
							</div>
						</div>
						
						<div class="row align-items-end" id="fila-info" style="height: 20%">
							<div class="col align-self-end">
								
								<div class="row extra-info mx-1" id="container-info" style="height:236px; display:none">
									<div class="col"><div class="row" style="height: 100%">
									<div class="col-12 px-4">
                                        <div class="row justify-content-end pt-1">
                                            <div class="col-1 text-right" onclick='ocultarExtraInfo()'><i class="fas fa-times extra-info__boton"></i></div>
                                        </div>

                                        <div class="row pt-2" style="height: 72%">
                                        	<div class="col container-tabla-extra-info">
                                        		<div class="col table-responsive" data-simplebar data-simplebar-auto-hide="false" style="height: 100%">
								
													<table id="tabla-provs" class="table table-borderless table-hover table-sm">
														<thead>
														    <tr class="tabla-header">
														      <th class="tabla-header--item" scope="col">Proveedores que la distribuyen</th>
														    </tr>
												  		</thead>
														 <tbody id="body-provs" class="tabla-body">
													    </tbody>
													</table>
												</div>
                                        	</div>
                                        </div>
                                        
                                    </div>
                                    </div></div>
								
								</div>
								
								
								<div class="row py-3 align-items-center" style="height: 20%" id="fila-insertar">
									
									<div class="col">
										<%if(mensaje != null){ %>
										<div id="mensaje" class="mensaje-alerta form-inline mr-4 justify-content-between float-right">
	                                         <p class="d-inline-flex pr-4"><%=mensaje%><p>
	                                         <button id="cerrar-mensaje" type="button" class="close flex-fill" aria-label="Close" style="color: #ff0837;"><span aria-hidden="true">&times;</span></button>
                                     	</div>
                                     	<%
                                     	request.getSession().setAttribute("mensaje", null);
										} %>
									</div>
									
									<div class="col-3">
										<%if(usuario.getRol() != Rol.USUARIO){ %>
										<button type="button" id="boton-tabla__insertar" class="btn boton-tabla__a�adir float-right" onclick="insertar()">Nueva marca</button>
										<%} %>
									</div>
								</div>
							</div>
							
						</div>
						
		
					</div>

				</div>
				
				
			
			</div>
			
			
		</div>
	</div>
	
	<div class="modal fade" id="modalMarca" tabindex="-1" role="dialog" aria-labelledby="modalMarca" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-md" role="document">
	    <div class="modal-content">
	    	<form id="insertar-marca" action="/marcas.do" method="post">
		    	<div id="variables" style="display: none;">
					<input id="accion" name="accion"></input> 
					<input id="codigo" name="codigo"></input>
				</div>
	      <div class="modal-header justify-content-between">
      		<div class="col">
      			<h5 class="modal-title" id="tituloModal">Marca</h5>
      		</div>
	      </div>
	      <div class="modal-body">
	        <div class="row">
	        	<div class="col px-4">
	        	
	        		<div class="row">
                        <div class="col-6">
                            <p class="modal__label">Nombre</p>
                            <input class="modal__input" type="text" id="insertar-nombre" name="insertar-nombre">
                        </div>
                        <div class="col-6">
                            <p class="modal__label">Tlfn.</p>
                            <input class="modal__input" type="text" id="insertar-tlfn" name="insertar-tlfn">
                        </div>
	        		</div>
	        		
	        		<div class="row pt-2">
	        			<div class="col">
                            <p class="modal__label">Direcci�n</p>
                            <input class="modal__input" type="text" id="insertar-direccion" name="insertar-direccion">
                        </div>
	        		</div>
	        		
	        		<div class="row pt-2">
	        			<div class="col">
                            <p class="modal__label">Proveedores</p>
                            <div class="form-group">
			                    <select class="mul-select modal__select" multiple="multiple" id="insertar-proveedores" name="insertar-proveedores">
			                    	<%for(Proveedor p: proveedores){%>
			                    		<option class="modal__select--opcion" id=<%=p.getNombre().replace(' ','_').replace('.', '_')%>><%=p.getNombre()%></option>
			                    	<%}%>
			                    </select>
			                </div> 

                        </div>
	        		</div>
	        		
	        	</div>
	        </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn boton-tabla__cancelar" onclick="cancelar()">Cancelar</button>
	        <button type="button" class="btn boton-tabla__a�adir" onclick="confirmar()" id="botonInsertar">Confirmar</button>
	      </div>
	      </form>
	    </div>
	  </div>
	</div>
	
	
	<script src="https://unpkg.com/simplebar@latest/dist/simplebar.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" crossorigin="anonymous"></script>
	<script	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script src="../js/bootstrap/bootstrap.min.js"></script>
	<script src="../js/marcas.js"></script>
	<script>inicializar();</script>
	
	<script> 
		function mostrarProvs(codmarca){
			$("#tabla-provs tbody tr").remove(); 
			body = document.getElementById("body-provs");
			
			<% for(Marca m : marcas){%>
				if(codmarca == "<%=m.getCodmarca()%>"){
					<%for(String p : m.getProveedores()){%>
						fila = document.createElement("tr");
						fila.classList.add("tabla-body--row");
						var prov = document.createElement("td");
						textoProv = document.createTextNode("<%=p%>");
						prov.appendChild(textoProv);
						fila.appendChild(prov);
						body.appendChild(fila);
					<%}%>
				}
			<%}%>
		}
		
	</script>
	
</body>
</html>