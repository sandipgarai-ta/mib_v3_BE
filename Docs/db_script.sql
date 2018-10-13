show tables;

create table offer ( 
	offer_id INT(100) PRIMARY KEY, 
	dt_create TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
	dt_modify TIMESTAMP DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP, 
	action_by INT(100), offer_name VARCHAR(255), 
	offer_img_link VARCHAR(255), 
	is_active INT(10) DEFAULT 1 
);
ALTER TABLE `offer` CHANGE `offer_id` `offer_id` INT(100) NOT NULL AUTO_INCREMENT;

create table testimonials (
	testimonial_id int(100) auto_increment primary key,
	dt_create TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	dt_modify TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	action_by INT(100),
	testimonial_body VARCHAR(255),
	client_name VARCHAR(255),
	client_designation VARCHAR(255),
	is_active int(10) DEFAULT 1
);


create table posts (
	post_id INT(100) PRIMARY KEY auto_increment,
	dt_create TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	dt_modify TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	post_title VARCHAR(255),
	post_body VARCHAR(255),
	is_active int(10) DEFAULT 1
);


select * from offer;
update offer set is_active =1 where is_active=0;

select * from posts;
