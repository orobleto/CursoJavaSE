package com.curso.java.entidades;

/**
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 22_Colecciones
 * @class Usuario
 * @description 
 * @date 24 jun. 2020
 */
public class Usuario implements Comparable<Usuario>{
	private String usuario;
	private String clave;
	
	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020  
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @param usuario
	 * @param clave 
	 */ 
	public Usuario(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
	}
	
	

	/**
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 24 jun. 2020 
	 * @return 
	 * @see java.lang.Object#hashCode() 
	 * </br> Un Objeto es igual a otro cuando poseen el mismo usuario
	 */ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	/**
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 24 jun. 2020 
	 * @param obj
	 * @return 
	 * @see java.lang.Object#equals(java.lang.Object) 
	 */ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	/**
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 24 jun. 2020 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */ 
	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", clave=" + clave + "]";
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @return the usuario 
	 */
	public String getUsuario() {
		return usuario;
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @param usuario the usuario to set 
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @return the clave 
	 */
	public String getClave() {
		return clave;
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @param clave the clave to set 
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 24 jun. 2020 
	 * @param o
	 * @return 
	 * @see java.lang.Comparable#compareTo(java.lang.Object) 
	 */ 
	@Override
	public int compareTo(Usuario usuario) {
		return this.usuario.compareTo(usuario.getUsuario());
	}

}
