package com.example.uploadingfiles.storage;

import com.example.uploadingfiles.model.User;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public interface StorageService {

	void store(List<User> userList);

}
