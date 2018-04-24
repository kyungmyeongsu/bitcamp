# 변경 내역
```
drop table pms_member;

create table pms_member (
    mid varchar(20) not null,
    email varchar(255) not null,
    pwd varchar(100) not null
);

alter table pms_member
    add constraint pms_member_pk primary key (mid);
```