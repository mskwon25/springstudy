CREATE TABLE student (
  student_id int not null,
  student_name varchar(10),
  student_birthday varchar(10),
  primary key(student_id)
);

CREATE TABLE professor(
  professor_id int not null,
  professor_name varchar(10),
  professor_birthday varchar(10),
  subject_name varchar(20),
  primary key(professor_id)
);

CREATE TABLE subject (
  subject_id int not null,
  subject_name varchar(20),
  primary key(subject_id)
);

CREATE TABLE score (
  score_id int not null,
  student_id int not null,
  subject_id int not null,
  score int,
  primary key(score_id, student_id, subject_id),
  foreign key(student_id) references student(student_id) on delete cascade,
  foreign key(subject_id) references subject(subject_id) on delete cascade
);

