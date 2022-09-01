function eliminarCliente(id){
	swal({
  		title: "Está seguro que desea eliminar?",
  		text: "Una vez eliminado, no podrá revertir la acción!",
  		icon: "warning",
  		buttons: true,
  		dangerMode: true,
		})
		.then((OK) => {
  			if (OK) {
				$.ajax({
					url:"/eliminarCliente/"+id,
					success: function(res){
						console.log(res);
					}
				});
   			swal("Eliminado con éxito!", {
      			icon: "success",
    		}).then((ok)=>{
				if(ok){
					location.href="/listarCliente";
				}
			});	
  			} else {
    swal("No se ha eliminado!");
  }
});

}

function eliminarPedido(id){
	swal({
  		title: "Está seguro que desea eliminar?",
  		text: "Una vez eliminado, no podrá revertir la acción!",
  		icon: "warning",
  		buttons: true,
  		dangerMode: true,
		})
		.then((OK) => {
  			if (OK) {
				$.ajax({
					url:"/eliminarPedido/"+id,
					success: function(res){
						console.log(res);
					}
				});
   			swal("Eliminado con éxito!", {
      			icon: "success",
    		}).then((ok)=>{
				if(ok){
					location.href="/listarPedido";
				}
			});	
  			} else {
    swal("No se ha eliminado!");
  }
});

}

function eliminarProveedor(id){
	swal({
  		title: "Está seguro que desea eliminar?",
  		text: "Una vez eliminado, no podrá revertir la acción!",
  		icon: "warning",
  		buttons: true,
  		dangerMode: true,
		})
		.then((OK) => {
  			if (OK) {
				$.ajax({
					url:"/eliminarProveedor/"+id,
					success: function(res){
						console.log(res);
					}
				});
   			swal("Eliminado con éxito!", {
      			icon: "success",
    		}).then((ok)=>{
				if(ok){
					location.href="/listarProveedor";
				}
			});	
  			} else {
    swal("No se ha eliminado!");
  }
});

}

function eliminarProducto(id){
	swal({
  		title: "Está seguro que desea eliminar?",
  		text: "Una vez eliminado, no podrá revertir la acción!",
  		icon: "warning",
  		buttons: true,
  		dangerMode: true,
		})
		.then((OK) => {
  			if (OK) {
				$.ajax({
					url:"/eliminarProducto/"+id,
					success: function(res){
						console.log(res);
					}
				});
   			swal("Eliminado con éxito!", {
      			icon: "success",
    		}).then((ok)=>{
				if(ok){
					location.href="/listarProducto";
				}
			});	
  			} else {
    swal("No se ha eliminado!");
  }
});

}

function eliminarPedidoItem(id){
	swal({
  		title: "Está seguro que desea eliminar?",
  		text: "Una vez eliminado, no podrá revertir la acción!",
  		icon: "warning",
  		buttons: true,
  		dangerMode: true,
		})
		.then((OK) => {
  			if (OK) {
				$.ajax({
					url:"/eliminarPedidoItem/"+id,
					success: function(res){
						console.log(res);
					}
				});
   			swal("Eliminado con éxito!", {
      			icon: "success",
    		}).then((ok)=>{
				if(ok){
					location.href="/listarPedidoItem";
				}
			});	
  			} else {
    swal("No se ha eliminado!");
  }
});

}

function pregunta(){
if (confirm("Estas seguro de enviar los datos de este formulario? \n Número de Confirmación: 8736"))
{
		
        document.forms["form_compra"].submit();
     }else{
		location.href="/home";
}
}


