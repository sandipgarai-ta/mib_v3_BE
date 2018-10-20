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

INSERT INTO `offer` (`offer_id`, `dt_create`, `dt_modify`, `action_by`, `offer_name`, `offer_img_link`, `is_active`, `offer_details`) VALUES (NULL, '2018-10-06 06:46:28', '2018-10-19 10:30:26', '1', 'Offer-3', 'offer.jpg', '1', 'Upto 70% off + Flat 50% Cashback');

INSERT INTO `offer` (`offer_id`, `dt_create`, `dt_modify`, `action_by`, `offer_name`, `offer_img_link`, `is_active`, `offer_details`) VALUES 
	(NULL, '2018-10-06 06:46:28', '2018-10-19 10:30:26', '1', 'Offer-4', 'offer.jpg', '1', 'Upto 70% off + Flat 50% Cashback'), 
	(NULL, '2018-10-06 06:46:28', '2018-10-19 10:30:26', '1', 'Offer-5', 'offer.jpg', '1', 'Upto 70% off + Flat 50% Cashback'), 
	(NULL, '2018-10-06 06:46:28', '2018-10-19 10:30:26', '1', 'Offer-6', 'offer.jpg', '1', 'Upto 70% off + Flat 50% Cashback');
select * from offer;
update offer set is_active =1 where is_active=0;

select * from posts;
