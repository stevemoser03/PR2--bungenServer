package networking.lv.time;

import java.beans.beancontext.BeanContextChildSupport;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TimeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (
			Socket client = new Socket("127.0.0.1", 1111);
	
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));){
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			
			System.out.println(br.readLine());
//			if(br.readLine().equals("exit")){
//				System.out.println(br.readLine());
//			}
			br.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
