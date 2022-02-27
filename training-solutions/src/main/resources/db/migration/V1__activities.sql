CREATE TABLE if NOT EXISTS activities (
	id BIGINT AUTO_INCREMENT,
	start_time TIMESTAMP,
	description VARCHAR(200),
	activity_type VARCHAR(20),
	CONSTRAINT pk_activities PRIMARY KEY (id)
);