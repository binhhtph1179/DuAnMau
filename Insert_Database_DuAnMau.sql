use EduSys
go

insert into chuyende values
 (N'CD001',N'java',1000000,N'6 tháng',N'anh-gai-xinh-deo-kinh-30.jpg',N'học code java',1),
 (N'CD002',N'C',2000000,N'6 tháng',N'anh-gai-xinh-deo-kinh-30.jpg',N'học code C',1),
 (N'CD003',N'C++',2000000,N'6 tháng',N'anh-gai-xinh-deo-kinh-30.jpg',N'học code C++',1),
 (N'CD004',N'python',3000000,N'6 tháng',N'anh-gai-xinh-deo-kinh-30.jpg',N'học code python',1),
 (N'CD005',N'Web',5000000,N'6 tháng',N'anh-gai-xinh-deo-kinh-30.jpg',N'học code web',1)

 insert into nhanvien values
 (N'NV01',N'Nguyễn Văn A','edusys',1,1,0),
 (N'NV02',N'Nguyễn Văn B','edusys',1,1,1),
 (N'NV03',N'Nguyễn Văn C','edusys',1,1,1),
 (N'NV04',N'Nguyễn Văn D','edusys',1,1,0)

 insert into nguoihoc values
 ('NH0001','Phạm Văn A','01-01-2020','01-01-2020',1,'0365719297','Apvph0001',N'không ghi chú','NV01',1),
 ('NH0002','Phạm Văn B','01-01-2020','01-01-2020',0,'0365719297','Bpvph0001',N'không ghi chú','NV02',1),
 ('NH0003','Phạm Văn C','01-01-2020','01-01-2020',1,'0365719297','Cpvph0001',N'không ghi chú','NV03',1),
 ('NH0004','Phạm Văn D','01-01-2020','01-01-2020',0,'0365719297','Dpvph0001',N'không ghi chú','NV01',1)

 insert into khoahoc values
 ('CD002',1000000,N'6 tháng','09-09-2020','09-09-2020','NV01','no ghi chú',1),
 ('CD001',1000000,N'6 tháng','09-09-2020','09-09-2020','NV02','no ghi chú',1),
 ('CD003',1000000,N'6 tháng','09-09-2020','09-09-2020','NV04','no ghi chú',1),
 ('CD004',1000000,N'6 tháng','09-09-2020','09-09-2020','NV02','no ghi chú',1),
 ('CD002',1000000,N'6 tháng','09-09-2020','09-09-2020','NV01','no ghi chú',1)


 insert into hocvien values
 (5,9,'NH0001'),
 (6,9,'NH0002'),
 (5,9,'NH0003'),
 (2,9,'NH0004'),
 (3,9,'NH0004'),
(4,9,'NH0004'),
(4,9,'NH0004'),
(1,9,'NH0004'),
(2,9,'NH0004'),
(6,9,'NH0004'),
(4,9,'NH0004'),
(3,9,'NH0004'),
(4,9,'NH0004'),
(6,9,'NH0004'),
(4,9,'NH0004'),
(5,9,'NH0004'),
(3,9,'NH0004'),
(4,9,'NH0004'),
(5,9,'NH0004'),
(1,9,'NH0004'),
(4,9,'NH0004'),
(2,9,'NH0004'),
(3,9,'NH0004'),
 (1,9,'NH0004')


 select * from nhanvien