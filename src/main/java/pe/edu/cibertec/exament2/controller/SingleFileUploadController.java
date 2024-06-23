package pe.edu.cibertec.exament2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class SingleFileUploadController {

    private static final String UPLOAD_DIR = "C:/Users/usuario/uploads";
    private static final long MAX_FILE_SIZE = 25 * 1024 * 1024;

    @PostMapping("/api/v1/files/single")
    public ResponseEntity<String> uploadSingleFile(@RequestParam("file") MultipartFile file) {
        try {

            if (file.getSize() > MAX_FILE_SIZE) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File size exceeds 25MB limit");
            }


            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            File destFile = new File(uploadDir.getAbsolutePath() + File.separator + file.getOriginalFilename());
            file.transferTo(destFile);


            return ResponseEntity.ok("File uploaded successfully");

        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file");
        }
    }
}
