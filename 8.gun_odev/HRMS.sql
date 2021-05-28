-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public."Users"
(
    id serial NOT NULL,
    "Email" "char" NOT NULL,
    "Password" "char" NOT NULL,
    "ConfirmPassword" "char" NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Employees"
(
    employee_id integer NOT NULL,
    "FirstName" character varying(25) NOT NULL,
    "LastName" character varying(25) NOT NULL,
    PRIMARY KEY (employee_id)
);

CREATE TABLE public."Jobseekers"
(
    jobseeker_id integer NOT NULL,
    "FirstName" character varying(20) NOT NULL,
    "LastName" character varying(20) NOT NULL,
    "Identity" character varying(11) NOT NULL,
    "BirthDate" date NOT NULL,
    PRIMARY KEY (jobseeker_id)
);

CREATE TABLE public."Companies"
(
    company_id integer NOT NULL,
    "CompanyName" character varying(50) NOT NULL,
    "WebAddress" character varying(75) NOT NULL,
    "PhoneNumber" character varying(11) NOT NULL,
    "Jobs" "char"[] NOT NULL,
    PRIMARY KEY (company_id)
);

CREATE TABLE public."JobTitles"
(
    "JobId" serial NOT NULL,
    "Title" character varying(50) NOT NULL,
    "companyId" integer NOT NULL,
    "Description" character varying(500) NOT NULL,
    "City" "char" NOT NULL,
    "Salary" "char" NOT NULL,
    "NumberOfPosition" integer NOT NULL,
    "Deadline" date NOT NULL,
    "isActive" boolean NOT NULL,
    PRIMARY KEY ("JobId")
);

CREATE TABLE public."CompanyActivation"
(
    id integer NOT NULL,
    "EmailVerify" boolean NOT NULL,
    "IsConfirmed" boolean NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."JobseekerActivation"
(
    id integer NOT NULL,
    "MernisVerify" boolean NOT NULL,
    "EmailVerify" boolean NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public."Users"
    ADD FOREIGN KEY (id)
    REFERENCES public."Employees" (employee_id)
    NOT VALID;


ALTER TABLE public."Users"
    ADD FOREIGN KEY (id)
    REFERENCES public."Jobseekers" (jobseeker_id)
    NOT VALID;


ALTER TABLE public."Jobseekers"
    ADD FOREIGN KEY (jobseeker_id)
    REFERENCES public."JobseekerActivation" (id)
    NOT VALID;


ALTER TABLE public."Users"
    ADD FOREIGN KEY (id)
    REFERENCES public."Companies" (company_id)
    NOT VALID;


ALTER TABLE public."Companies"
    ADD FOREIGN KEY (company_id)
    REFERENCES public."CompanyActivation" (id)
    NOT VALID;

END;