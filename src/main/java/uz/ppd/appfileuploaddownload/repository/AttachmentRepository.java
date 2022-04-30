package uz.ppd.appfileuploaddownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.ppd.appfileuploaddownload.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
