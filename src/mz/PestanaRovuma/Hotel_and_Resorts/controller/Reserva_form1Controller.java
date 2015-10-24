package mz.PestanaRovuma.Hotel_and_Resorts.controller;



import java.util.Date;

import org.zkoss.util.Dates;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Textbox;

public class Reserva_form1Controller extends GenericForwardComposer{
	
	private Datebox date_CheckIn, date_CheckOut;
	private Checkbox chck_standard, chck_executivo, chck_apartamento;
	private Combobox cmb_standard, cmb_executivo, cmb_apartamento, cmb_titulo;
	private Textbox txt_nome, txt_apelido,txt_end_Elct, txt_conf_end_Elct;
	private Button btn_primeiro, btn_segundo, btn_terceiro, btn_Voltar0, btn_continuar0;
	
	public void onClick$btn_continuar0(Event e){
		Executions.sendRedirect("/reserva_form2.zul");
	}
}
