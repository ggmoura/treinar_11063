package br.com.treinar.validator;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.treinar.model.Telefone;


@FacesValidator("br.com.treinar.validator.TelefoneValidator")
public class TelefoneValidator implements Validator {

	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		StringBuilder url = new StringBuilder();
		String urlValue = value.toString();
		if (value != null) {
			List<Integer> dddsValidos = new ArrayList<Integer>();
			dddsValidos.add(11);
			dddsValidos.add(21);
			dddsValidos.add(31);
			Telefone t = (Telefone) value;
			if (!dddsValidos.contains(t.getDdd())) {
				FacesMessage msg = new FacesMessage("DDD inválido", "DDD deve ser 11, 21 ou 31");
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(msg);
			}
		}
		url.append(urlValue);

	}

}
