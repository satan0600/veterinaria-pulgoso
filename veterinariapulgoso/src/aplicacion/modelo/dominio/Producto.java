package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Producto implements Serializable {
	private String nombreProducto, marcaProducto;
	private Integer idProducto;
	private double precioProducto;
	private TipoOferta tipoOfertaProducto;

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public TipoOferta getTipoOfertaProducto() {
		return tipoOfertaProducto;
	}

	public void setTipoOfertaProducto(TipoOferta tipoOfertaProducto) {
		this.tipoOfertaProducto = tipoOfertaProducto;
	}

	public Producto(String nombreProducto, String marcaProducto, Integer idProducto, double precioProducto,
			TipoOferta tipoOfertaProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.marcaProducto = marcaProducto;
		this.idProducto = idProducto;
		this.precioProducto = precioProducto;
		this.tipoOfertaProducto = tipoOfertaProducto;
	}

	public Producto() {
		// TODO Auto-generated constructor stub
	}

}
