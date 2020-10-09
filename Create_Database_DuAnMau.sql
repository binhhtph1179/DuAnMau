create database EduSys
go
use EduSys
go

create table nhanvien
(
manhanvien varchar(20) not null,
hoten nvarchar(30) not null,
matkhau nvarchar(30)not null,
vatro bit not null,
delete_at bit,
firstlogin bit,
constraint PK_nhanvien primary key (manhanvien) 
)
go

create table chuyende
(
machuyende varchar(20) not null,
tenchuyende nvarchar(50) not null,
hocphi money not null,
thoiluong nvarchar(10) not null,
hinh nvarchar(100),
mota nvarchar(300),
delete_at bit,
constraint PK_chuyende primary key (machuyende)
)
go

create table nguoihoc
(
manguoihoc varchar(20)not null,
hoten nvarchar(40) not null,
ngaysinh date,
ngayDK date,
gioitinh bit,
dienthoai nvarchar(13),
Email nvarchar(45),
ghichu nvarchar(300),	
manhanvien varchar(20) not null,
delete_at bit,
constraint PK_nguoihoc primary key (manguoihoc),
Constraint FP_nguoihoc_nhanvien foreign key (manhanvien) references nhanvien(manhanvien)on delete no action on update cascade
)
go

create table khoahoc
(
makhoahoc int identity(1,1) ,
machuyende varchar(20) not null,
hocphi money,
thoiluong nvarchar(10),
ngaykhaigiang date,
ngayta date,
manhanvien varchar(20) not null,
ghichu nvarchar(300),
delete_at bit,
constraint PK_khoahoc primary key (makhoahoc),
constraint FK_khoahoc_chuyende foreign key (machuyende) references chuyende(machuyende)on delete no action on update cascade , 
constraint FK_khoahoc_nhanvien foreign key (manhanvien) references nhanvien(manhanvien)on delete no action on update cascade 
)
go

create table  hocvien
(
mahocvien int identity(1,1) ,
makhoahoc int not null,
diem int ,
manguoihoc varchar(20)not null,
constraint PK_hocvien primary key (mahocvien),
constraint FK_hocvien_khoahoc foreign key (makhoahoc) references khoahoc(makhoahoc),
constraint FK_hocvien_nguoihoc foreign key (manguoihoc) references nguoihoc(manguoihoc)
)
go

