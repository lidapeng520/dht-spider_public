package vip.rory.dht.dao.entity;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author zhanghangtian
 * @date 2019年7月10日 下午4:05:13
 */
@Data
@Getter
@Setter
@Accessors(chain = true)
@ToString
@Table(name = "metadata")
public class Metadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long        id;

    private String        name;

    private String        announce;

    private String        comment;

    private String        createdBy;

    private String        infoHash;

    private LocalDateTime creationTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
