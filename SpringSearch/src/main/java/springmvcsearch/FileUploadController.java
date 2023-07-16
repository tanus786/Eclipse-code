package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/upload")
	public String fileUpload() {

		return "fileform";
	}

	@RequestMapping(path = "uploadimage", method = RequestMethod.POST)
	public String doneUpload(@RequestParam("file") CommonsMultipartFile file, HttpSession s, Model model) {

		byte[] data = file.getBytes();
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "image" + File.separator + file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file Uploaded");
			model.addAttribute("msg", "Uploaded Successfully");
			model.addAttribute("filename", file.getOriginalFilename());

		} catch (Exception e) {
			model.addAttribute("msg", "Not Uploaded Successfully");
			System.out.println(e);
		}
		// we have to save this file to server
//		System.out.println(file.getSize());
//		System.out.println(file.getContentType());
//		System.out.println(file.getName());
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getStorageDescription());
//		System.out.println("doneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		return "filesuccess";
	}
}
