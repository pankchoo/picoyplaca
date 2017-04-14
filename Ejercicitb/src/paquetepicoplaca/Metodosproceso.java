package paquetepicoplaca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Metodosproceso {
	public String getDiaSemana(String fecha) {
		String Valor_dia = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaActual = null;
		try {
			fechaActual = df.parse(fecha);
		} catch (ParseException e) {
			System.err.println("No se ha podido parsear la fecha.");
			e.printStackTrace();
		}
		GregorianCalendar fechaCalendario = new GregorianCalendar();
		fechaCalendario.setTime(fechaActual);
		int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);

		if (diaSemana == 1) {
			Valor_dia = "Sunday";
		} else if (diaSemana == 2) {
			Valor_dia = "Monday";
		} else if (diaSemana == 3) {
			Valor_dia = "Tuesday";
		} else if (diaSemana == 4) {
			Valor_dia = "Wednesday";
		} else if (diaSemana == 5) {
			Valor_dia = "Thursday";
		} else if (diaSemana == 6) {
			Valor_dia = "Friday";
		} else if (diaSemana == 7) {
			Valor_dia = "Saturday";
		}
		return Valor_dia;
	}

	public String getCirculacion(String Valor_dia, String Hora, String placa) {
		String circula = null;
		boolean interruptor = false;
		String nuevahora = "";
		int longituplaca = 0;
		int nh;
		String pl = "";
		int ultimodigito;
		nuevahora = nuevahora + Hora.substring(0, 2);
		nuevahora = nuevahora + Hora.substring(3, 5);
		nh = Integer.parseInt(nuevahora);
		longituplaca = placa.length();
		pl = placa.substring(longituplaca - 1, longituplaca);
		ultimodigito = Integer.parseInt(pl);
		if (Valor_dia.equalsIgnoreCase("Monday")) {
			if (ultimodigito == 1 || ultimodigito == 2) {
				if (nh >= 700 && nh <= 930 || nh >= 1600 && nh <= 1930) {
					//circula = "<label class='alert alert-danger'> The car CAN NOT be on the road </label>";
					interruptor = false;
				} else {
					//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
					interruptor = true;
				}
			}
			if (ultimodigito != 1 && ultimodigito != 2) {
				//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
				interruptor = true;
			}
		}
		if (Valor_dia.equalsIgnoreCase("Tuesday")) {
			if (ultimodigito == 3 || ultimodigito == 4) {
				if (nh >= 700 && nh <= 930 || nh >= 1600 && nh <= 1930) {
					//circula = "<label class='alert alert-danger'> The car CAN NOT be on the road </label>";
					interruptor = false;
				} else {
					//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
					interruptor = true;
				}
			}
			if (ultimodigito != 3 && ultimodigito != 4) {
				//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
				interruptor = true;
			}
		}
		if (Valor_dia.equalsIgnoreCase("Wednesday")) {
			if (ultimodigito == 5 || ultimodigito == 6) {
				if (nh >= 700 && nh <= 930 || nh >= 1600 && nh <= 1930) {
					//circula = "<label class='alert alert-danger'> The car CAN NOT be on the road </label>";
					interruptor = false;
				} else {
					//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
					interruptor = true;
				}
			}
			if (ultimodigito != 5 && ultimodigito != 6) {
				//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
				interruptor = true;
			}
		}
		if (Valor_dia.equalsIgnoreCase("Thursday")) {
			if (ultimodigito == 7 || ultimodigito == 8) {
				if (nh >= 700 && nh <= 930 || nh >= 1600 && nh <= 1930) {
					//circula = "<label class='alert alert-danger'> The car CAN NOT be on the road </label>";
					interruptor = false;
				} else {
					//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
					interruptor = true;
				}
			}
			if (ultimodigito != 7 && ultimodigito != 8) {
				//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
				interruptor = true;
			}
		}
		if (Valor_dia.equalsIgnoreCase("Friday")) {
			if (ultimodigito == 9 || ultimodigito == 0) {
				if (nh >= 700 && nh <= 930 || nh >= 1600 && nh <= 1930) {
					//circula = "<label class='alert alert-danger'> The car CAN NOT be on the road </label>";
					interruptor = false;
				} else {
					//circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
					interruptor = true;
				}
			}
			if (ultimodigito != 9 && ultimodigito != 0) {
				// circula = "<label class='alert alert-success'> The car CAN be on the road </label>";
				interruptor = true;
			}
		}
		if (Valor_dia.equalsIgnoreCase("Saturday")) {
			// circula="<label class='alert alert-success'> The car CAN be on the road </label>";
			interruptor = true;
		}
		if (Valor_dia.equalsIgnoreCase("Sunday")) {
			// circula="<label class='alert alert-success'> The car CAN be on the road </label>";
			interruptor = true;
		}
		if(interruptor==true){
			circula="<label class='alert alert-success'> The car CAN be on the road </label>";
		}
		if(interruptor==false){
			circula = "<label class='alert alert-danger'> The car CAN NOT be on the road </label>";
		}
		return circula;
	}
}
