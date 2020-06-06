var accion = "";
var codigo = "";

function inicializar() {
	$("input").attr("spellcheck", "false");
	$(document.body).on("click", "td:not(.info)", function() {
		mostrarExtraInfo(this.parentElement.dataset.fila);
	});
}

function insertar() {
	accion = "insertar";
	var campos = ["cas", "nombre", "formula", "f_des", "einecs", "ec", "precauciones"];
	campos.forEach(function(valor, indice, array) {
		document.getElementById("insertar-" + valor).value = "";
	});
	document.getElementById("tituloModal").innerText = "Nuevo producto"
	$("#modalProducto").modal();
}

function editar(cod) {
	accion = "editar";
	codigo = cod;
	var campos = ["cas", "nombre", "formula", "f_des", "einecs", "ec"];
	campos.forEach(function(valor, indice, array) {
		document.getElementById("insertar-" + valor).value = document
				.getElementById(valor + "-" + cod).innerText;
	});
	

	document.getElementById("tituloModal").innerText = "Editar producto (#"+cod+")";
	$("#modalProducto").modal();
}

function cancelar() {
	accion = "";
	$("#modalProducto").modal("hide");
}

function confirmar() {
	document.getElementById("accion").value = accion;
	document.getElementById("codigo").value = codigo;
	document.getElementById("insertar-producto").submit();
}

function filtrar(campo, col) {
	var input, filter, table, tr, td, i, txtValue;
	input = document.getElementById("filtro-" + campo);
	filtro = input.value.toUpperCase();
	tabla = document.getElementById("tabla-productos");
	tr = tabla.getElementsByTagName("tr");

	for (i = 0; i < tr.length; i++) {
		td = tr[i].getElementsByTagName("td")[col];
		if (td) {
			txtValue = td.textContent || td.innerText;
			if (txtValue.toUpperCase().indexOf(filtro) > -1) {
				tr[i].style.display = "";
			} else {
				tr[i].style.display = "none";
			}
		}
	}
}

function mostrarExtraInfo(codentrada) {
	var campos = ["peso", "einecs", "ec"];
	campos.forEach(function(valor, indice, array) {
		document.getElementById("extra-info-" + valor).innerText = document
				.getElementById(valor + "-" + codentrada).innerText;
	});

	document.getElementById("fila-tabla").style.height = "35%";
	document.getElementById("fila-info").style.height = "65%";
	document.getElementById("container-info").style.display = "";

}

function ocultarExtraInfo() {
	document.getElementById("fila-tabla").style.height = "80%";
	document.getElementById("fila-info").style.height = "20%";
	document.getElementById("container-info").style.display = "none";
}
