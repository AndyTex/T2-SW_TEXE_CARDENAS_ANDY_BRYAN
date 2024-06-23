package pe.edu.cibertec.exament2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/upload")
public class FileUploadController {

    private static final List<String> allowedExtensions = Arrays.asList("pdf", "png", "docx");

    @PostMapping("/multiple")
    public ResponseEntity<String> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        for (MultipartFile file : files) {
            String extension = getFileExtension(file.getOriginalFilename());
            if (!allowedExtensions.contains(extension)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid file extension: " + extension);
            }
        }

        return ResponseEntity.ok("Files uploaded successfully");
    }

    private String getFileExtension(String filename) {
        return filename.substring(filename.lastIndexOf(".") + 1);
    }
}
