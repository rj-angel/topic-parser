package com.topic.parserAdapter.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

@Table("t_doc")
public class Document implements Serializable {

	private static final long serialVersionUID = -3657087473988616304L;

	@Id
	@Column("doc_id")
	@Comment("主键")
	private Long docId;

	@Column("user_id")
	@Comment("用户流水号")
	private String userId;

	@Column("school")
	@Comment("学校")
	private String school;

	@Column("class")
	@Comment("年级")
	private String className;

	@Column("subject")
	@Comment("科目")
	private String subject;
	
	@Column("doc_type")
	@Comment("情景类别")
	private String docType;

	@Column("hours")
	@Comment("课时")
	private String hours;

	@Column("create_time")
	@Comment("创建时间")
	private Date createTime;

	@Column("file_name")
	@Comment("文件名称")
	private String fileName;

	@Column("file_size")
	@Comment("文件大小")
	private String fileSize;

	private String createTimeStr;

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public void setCreateTimeStr(Date createTime){
		Timestamp ts = new Timestamp(createTime.getTime());
		String str = ts.toString();
		str = str.substring(0, str.indexOf("."));
		this.createTimeStr = str;
	}
	
	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}
	
}
