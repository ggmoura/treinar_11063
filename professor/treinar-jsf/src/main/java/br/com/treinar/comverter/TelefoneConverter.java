package br.com.treinar.comverter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.model.Telefone;

@FacesConverter("br.com.treinar.comverter.TelefoneConverter")
public class TelefoneConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Telefone t = null;
		if (value != null && value.length() == 11) {
			t = new Telefone();
			t.setDdd(Integer.valueOf(value.substring(0, 2)));
			t.setNumero(Integer.valueOf(value.substring(2)));
		}
		return t;
	}

	public String getAsString(FacesContext context, UIComponent component, Object telefone) {
		String retorno = null;
		if (telefone != null) {
			Telefone o = (Telefone) telefone;
			String ddd = String.valueOf(o.getDdd());
			String numero = String.valueOf(o.getNumero());
			retorno = ddd.concat(numero);
		}
		return retorno;
	}

}
