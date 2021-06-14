     
CREATE TABLE department (
        department_id SERIAL NOT NULL,
        name varchar(100) NOT NULL,
        CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)
        );
        
CREATE TABLE job_title (
        title_id SERIAL NOT NULL,
        job_title varchar(100) NOT NULL,
        CONSTRAINT pk_job_title_title_id PRIMARY KEY (title_id)
);
?
CREATE TABLE employee (
        employee_id SERIAL NOT NULL,
        title_id int NOT NULL,
        last_name varchar(100) NOT NULL,
        first_name varchar(100) NOT NULL,
        gender varchar(100) NOT NULL,
        date_of_birth timestamp NOT NULL,
        department_id int NOT NULL,
        CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id),
        CONSTRAINT fk_department_department_id FOREIGN KEY (department_id) REFERENCES department(department_id),
        CONSTRAINT fk_job_title_title_id FOREIGN KEY (title_id) REFERENCES job_title(title_id)
        );
        
CREATE TABLE project (
        project_id SERIAL NOT NULL,
        name varchar(100) NOT NULL,
        start_date timestamp NOT NULL,
        CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
        );
        
CREATE TABLE employee_project (
        employee_id int NOT NULL,
        project_id int NOT NULL,
        CONSTRAINT fk_employee_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
        CONSTRAINT fk_project_project_id FOREIGN KEY (project_id) REFERENCES project(project_id)
);
?
?
INSERT INTO job_title (title_id, job_title) VALUES (1, 'Lead Scientist');
INSERT INTO job_title (title_id, job_title) VALUES (2, 'Juinor Scientist');
INSERT INTO job_title (title_id, job_title) VALUES (3, 'Senior Scientist');
INSERT INTO job_title (title_id, job_title) VALUES (4, 'Lead Maintenance');
INSERT INTO job_title (title_id, job_title) VALUES (5, 'Junior Engineer');
INSERT INTO job_title (title_id, job_title) VALUES (6, 'Senior Engineer');
INSERT INTO job_title (title_id, job_title) VALUES (7, 'Lead Engineer');
INSERT INTO job_title (title_id, job_title) VALUES (8, 'Janitor');
?
INSERT INTO department (department_id, name) VALUES (1, 'Engineering');
INSERT INTO department (department_id, name) VALUES (2, 'Science');
INSERT INTO department (department_id, name) VALUES (3, 'Maintenance');
?
INSERT INTO employee (employee_id, title_id, last_name, first_name, gender, date_of_birth, department_id) VALUES (1, 1, 'Jmali', 'Malika', 'Female', TO_DATE('19/12/1990', 'DD/MM/YYYY'), 2);
INSERT INTO employee (employee_id, title_id, last_name, first_name, gender, date_of_birth, department_id) VALUES (2, 3, 'Obeidat', 'Ahmad', 'Male', TO_DATE('02/05/1998', 'DD/MM/YYYY'), 2);
INSERT INTO employee (employee_id, title_id, last_name, first_name, gender, date_of_birth, department_id) VALUES (3, 2, 'Hollins', 'Bruce', 'Male', TO_DATE('02/03/1991', 'DD/MM/YYYY'), 2);
INSERT INTO employee (employee_id, title_id, last_name, first_name, gender, date_of_birth, department_id) VALUES (4, 5, 'Teos', 'Kevin', 'Male', TO_DATE('20/04/1993', 'DD/MM/YYYY'), 1);
INSERT INTO employee (employee_id, title_id, last_name, first_name, gender, date_of_birth, department_id) VALUES (5, 7, 'Hamilton', 'Tony', 'Male', TO_DATE('12/11/1800', 'DD/MM/YYYY'), 1);
INSERT INTO employee (employee_id, title_id, last_name, first_name, gender, date_of_birth, department_id) VALUES (6, 6, 'Esanbi', 'Hania', 'Female', TO_DATE('01/12/2001', 'DD/MM/YYYY'), 1);
INSERT INTO employee (employee_id, title_id, last_name, first_name, gender, date_of_birth, department_id) VALUES (7, 8, 'Jmali', 'Rita', 'Female', TO_DATE('12/07/2980', 'DD/MM/YYYY'), 3);
INSERT INTO employee (employee_id, title_id, last_name, first_name, gender, date_of_birth, department_id) VALUES (8, 4, 'Jmali', 'Alaa', 'Male', TO_DATE('17/06/1984', 'DD/MM/YYYY'), 3);
?
INSERT INTO project (project_id, name, start_date) VALUES (1, 'New Toilets', TO_DATE('07/04/2020', 'DD/MM/YYYY'));
INSERT INTO project (project_id, name, start_date) VALUES (2, 'Data Analysis', TO_DATE('20/12/2021', 'DD/MM/YYYY'));
INSERT INTO project (project_id, name, start_date) VALUES (3, 'Bridge Project',TO_DATE('11/06/2021', 'DD/MM/YYYY'));
INSERT INTO project (project_id, name, start_date) VALUES (4, 'Dance Party',TO_DATE('14/02/2021', 'DD/MM/YYYY'));
?
INSERT INTO employee_project (employee_id, project_id) VALUES (2, 1);
INSERT INTO employee_project (employee_id, project_id) VALUES (4, 2);
INSERT INTO employee_project (employee_id, project_id) VALUES (5, 3);
INSERT INTO employee_project (employee_id, project_id) VALUES (1, 4);