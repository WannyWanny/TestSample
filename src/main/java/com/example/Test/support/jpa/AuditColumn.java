package com.example.Test.support.jpa;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners({AuditingEntityListener.class})
public class AuditColumn {

    @CreatedDate
    @Column(name = "create_dtm", updatable = false)
    @Schema(description = "생성일시")
    protected LocalDateTime regDtm;

    @LastModifiedDate
    @Column(name = "last_update_dtm")
    @Schema(description = "최종업데이트일시")
    protected LocalDateTime modDtm;
}
