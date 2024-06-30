package co.develhope.uploadFile.dto;

import co.develhope.uploadFile.entities.User;
import lombok.Data;

@Data
public class DownloadProfilePictureDTO {
    private User user;
    private byte[] profileImage;
}
