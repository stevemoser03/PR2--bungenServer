package networking.lv.time;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {

	public static void main(String[] args) {
		
		int count = 0;
		while(true){
		try (
			ServerSocket ss = new ServerSocket(1111);){
			Socket s = ss.accept();
			count++;
			if(count <= 10){
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));{
//		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				bw.write("count: "+count+", Time: "+LocalDateTime.now().toString());
				bw.flush();
				}
//				if(br.readLine().equals("exit")){
//					break;
//				}
				
			}
			else break;
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}	
	}
}
