

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class Fileupload extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
			
	 List <FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
     for(FileItem item : multiparts){
         
             String name = new File(item.getName()).getName();
             item.write( new File("c:/sarath" + File.separator + name));
			
		}
     System.out.println("file uploaded");
}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}


