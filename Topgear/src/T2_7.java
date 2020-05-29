import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class T2_7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String str="21/11/2005";
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(str);
		System.out.println(str+"\t"+date1);
	}

}
