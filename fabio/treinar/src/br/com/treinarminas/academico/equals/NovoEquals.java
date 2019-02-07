package br.com.treinarminas.academico.equals;

public class NovoEquals {
	int j;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + j;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NovoEquals other = (NovoEquals) obj;
		if (j != other.j)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NovoEquals [j=" + j + "]";
	}


	

	
}
