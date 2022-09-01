package com.crud.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.demo.interfaceService.IclienteService;
import com.crud.demo.interfaceService.IpedidoItemService;
import com.crud.demo.interfaceService.IpedidoService;
import com.crud.demo.interfaceService.IproductoService;
import com.crud.demo.interfaceService.IproveedorService;
import com.crud.demo.modelo.Cliente;
import com.crud.demo.modelo.Pedido;
import com.crud.demo.modelo.PedidoItem;
import com.crud.demo.modelo.Producto;
import com.crud.demo.modelo.Proveedor;

@Controller
@RequestMapping
public class Controlador {
	
	@GetMapping("/login")
	public String login(Model model) {
		return("index");
	}
	
	
	@GetMapping("/home")
	public String home(Model model) {
		return("home/index");
	}
	
	//Tabla Cliente
	@Autowired
	private IclienteService service;
	
	@GetMapping("/listarCliente")
	public String listar(Model model) {
		List<Cliente>clientes=service.listar();
		model.addAttribute("clientes", clientes);
		return "crud/clientes/index";
	}
	
	@GetMapping("/newCliente")
	public String agregar(Model model) {
		model.addAttribute("cliente", new Cliente());
		return("crud/clientes/form");
	}
	
	@PostMapping("/saveCliente")
	public String save(@Validated Cliente c, Model model) {
		service.save(c);
		return "redirect:/listarCliente";
	}
	
	
	
	@GetMapping("/editarCliente/{ClienteID}")
	public String editar(@PathVariable int ClienteID, Model model) {
		Optional<Cliente>cliente=service.listarId(ClienteID);
		model.addAttribute("cliente", cliente);
		return "crud/clientes/form";
	}
	
	@GetMapping("/eliminarCliente/{ClienteID}")
	public String delete(@PathVariable int ClienteID, Model model) {
		service.delete(ClienteID);
		return "redirect:/listarCliente";
	}
	
	
	
	
	/*@GetMapping("/detalle/{ClienteID}")
	public String detalle(@PathVariable int ClienteID, Model model) {
		Optional<Cliente>cliente=service.listarId(ClienteID);
		model.addAttribute("cliente", cliente);
		return "detalle";
	}*/
	
	//Tabla Pedido
		@Autowired
		private IpedidoService servicePedido;
		
		@GetMapping("/listarPedido")
		public String listarPedido(Model model) {
			List<Pedido>pedidos=servicePedido.listar();
			model.addAttribute("pedidos", pedidos);
			List<Cliente>clientes=service.listar();
			model.addAttribute("clientes", clientes);
			return "crud/pedidos/index";
		}
		
		@GetMapping("/newPedido")
		public String agregarPedido(Model model) {
			model.addAttribute("pedido", new Pedido());
			List<Cliente>clientes=service.listar();
			model.addAttribute("clientes", clientes);
			return("crud/pedidos/form");
		}
		
		@PostMapping("/savePedido")
		public String savePedido(@Validated Pedido p, Model model) {
			servicePedido.save(p);
			return "redirect:/listarPedido";
		}
		
		@GetMapping("/editarPedido/{PedidoID}")
		public String editarPedido(@PathVariable int PedidoID, Model model) {
			Optional<Pedido>pedido=servicePedido.listarId(PedidoID);
			model.addAttribute("pedido", pedido);
			List<Cliente>clientes=service.listar();
			model.addAttribute("clientes", clientes);
			return "crud/pedidos/form";
		}
		
		@GetMapping("/eliminarPedido/{PedidoID}")
		public String deletePedido(@PathVariable int PedidoID, Model model) {
			servicePedido.delete(PedidoID);
			return "redirect:/listarPedido";
		}
		
		//Tabla Proveedor
		@Autowired
		private IproveedorService serviceProveedor;
		
		@GetMapping("/listarProveedor")
		public String listarProveedor(Model model) {
			List<Proveedor>proveedores = serviceProveedor.listar();
			model.addAttribute("proveedores", proveedores);
			return "crud/proveedores/index";
		}
		
		@GetMapping("/newProveedor")
		public String agregarProveedor(Model model) {
			model.addAttribute("proveedor", new Proveedor());
			return "crud/proveedores/form";
			
		}
		
		@PostMapping("/saveProveedor")
		public String saveProveedor(@Validated Proveedor prov,Model model) {
			serviceProveedor.save(prov);
			return "redirect:/listarProveedor";
		}	
		
		@GetMapping("/editarProveedor/{id}")
		public String editarProveedor(@PathVariable int id, Model model) {
			Optional<Proveedor>proveedor=serviceProveedor.listarId(id);
			model.addAttribute("proveedor", proveedor);
			return "crud/proveedores/form";
		}
		
		@GetMapping("/eliminarProveedor/{id}")
		public String deleteProveedor(Model model, @PathVariable int id) {
			serviceProveedor.delete(id);
			return "redirect:/listarProveedor";
			
		}
		
		//Tabla Producto
				@Autowired
				private IproductoService serviceProducto;
				
				@GetMapping("/listarProducto")
				public String listarProducto(Model model) {
					List<Producto>productos=serviceProducto.listar();
					model.addAttribute("productos", productos);
					List<Proveedor>proveedores=serviceProveedor.listar();
					model.addAttribute("proveedores", proveedores);
					return "crud/productos/index";
				}
				
				@GetMapping("/detalleProducto/{ProductoID}")
				public String detalleProducto(@PathVariable int ProductoID, Model model) {
					Optional<Producto>producto=serviceProducto.listarId(ProductoID);
					model.addAttribute("producto", producto.get());
					List<Proveedor>proveedores=serviceProveedor.listar();
					model.addAttribute("proveedores", proveedores);
					return "crud/productos/detalle";
				}
				
				@GetMapping("/newProducto")
				public String agregarProducto(Model model) {
					model.addAttribute("producto", new Producto());
					List<Proveedor>proveedores=serviceProveedor.listar();
					model.addAttribute("proveedores", proveedores);
					List<PedidoItem>pedidositems=servicePedidoItem.listar();
					model.addAttribute("pedidositems", pedidositems);
					return("crud/productos/form");
				}
				
				@PostMapping("/saveProducto")
				public String saveProducto(@Validated Producto pro, Model model) {
					serviceProducto.save(pro);
					return "redirect:/listarProducto";
				}
				
				@GetMapping("/editarProducto/{ProductoID}")
				public String editarProducto(@PathVariable int ProductoID, Model model) {
					Optional<Producto>producto=serviceProducto.listarId(ProductoID);
					model.addAttribute("producto", producto);
					List<Proveedor>proveedores=serviceProveedor.listar();
					model.addAttribute("proveedores", proveedores);
					return "crud/productos/form";
				}
				
				@GetMapping("/eliminarProducto/{ProductoID}")
				public String deleteProducto(@PathVariable int ProductoID, Model model) {
					serviceProducto.delete(ProductoID);
					return "redirect:/listarProducto";
				}
				
				
				//Tabla PedidosItem
				@Autowired
				private IpedidoItemService servicePedidoItem;
				
				@GetMapping("/listarPedidoItem")
				public String listarPedidoItem(Model model) {
					List<PedidoItem>pedidositems=servicePedidoItem.listar();
					model.addAttribute("pedidositems", pedidositems);
					List<Producto>productos=serviceProducto.listar();
					model.addAttribute("productos", productos);
					List<Pedido>pedidos=servicePedido.listar();
					model.addAttribute("pedidos", pedidos);
					List<Cliente>clientes=service.listar();
					model.addAttribute("clientes", clientes);
					return "crud/pedidosItems/index";
				}
				
				@GetMapping("/newPedidoItem")
				public String agregarPedidoItem(Model model) {
					model.addAttribute("pedidoitem", new PedidoItem());
					List<Producto>productos=serviceProducto.listar();
					model.addAttribute("productos", productos);
					List<Pedido>pedidos=servicePedido.listar();
					model.addAttribute("pedidos", pedidos);
					return("crud/pedidosItems/form");
				}
				
				@PostMapping("/savePedidoItem")
				public String savePedidoItem(@Validated PedidoItem pi, Model model) {
					servicePedidoItem.save(pi);
					return "redirect:/listarPedidoItem";
				}
				
				@GetMapping("/editarPedidoItem/{PedidoItemID}")
				public String editarPedidoItem(@PathVariable int PedidoItemID, Model model) {
					Optional<PedidoItem>pedidoitem=servicePedidoItem.listarId(PedidoItemID);
					model.addAttribute("pedidoitem", pedidoitem);
					List<Producto>productos=serviceProducto.listar();
					model.addAttribute("productos", productos);
					List<Pedido>pedidos=servicePedido.listar();
					model.addAttribute("pedidos", pedidos);
					return "crud/pedidosItems/form";
				}
				
				@GetMapping("/eliminarPedidoItem/{PedidoItemID}")
				public String deletePedidoItem(@PathVariable int PedidoItemID, Model model) {
					servicePedidoItem.delete(PedidoItemID);
					return "redirect:/listarPedidoItem";
				}
		
				
				//carrito
				@GetMapping("/detalleCliente/{ClienteID}")
				public String detalleCliente(@PathVariable int ClienteID, Model model) {
					Optional<Cliente>cliente=service.listarId(ClienteID);
					model.addAttribute("cliente", cliente.get());
					List<Pedido>pedidos=servicePedido.listar();
					model.addAttribute("pedidos", pedidos);
					List<PedidoItem>pedidositems=servicePedidoItem.listar();
					model.addAttribute("pedidositems", pedidositems);
					List<Producto>productos=serviceProducto.listar();
					model.addAttribute("productos", productos);
					return "crud/clientes/detalle";
				}
				
				@GetMapping("/resumen/{PedidoItemID}")
				public String detalleCompra(@PathVariable int PedidoItemID, Model model) {
					Optional<PedidoItem>pedidoitem=servicePedidoItem.listarId(PedidoItemID);
					model.addAttribute("pedidoitem", pedidoitem.get());
					List<Producto>productos=serviceProducto.listar();
					model.addAttribute("productos", productos);
		
					return "crud/pedidosItems/resumen";
				}
	
				
		
	
}
