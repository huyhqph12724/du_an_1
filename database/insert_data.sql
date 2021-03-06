-- INSERT

USE POLYMART_v1
GO

INSERT INTO LOAISANPHAM (TEN)
VALUES 
(N'ÁO THUN TAY NGẮN'),
(N'ÁO THUN TAY DÀI'),
(N'ÁO SƠ MI TAY NGẮN'),
(N'ÁO SƠ MI TAY DÀI'),
(N'QUẦN SHORT'),
(N'QUẦN JEAN'),
(N'QUẦN JOGGER'),
(N'CHÂN VÁY')

INSERT INTO SANPHAM (IDLOAISANPHAM, TEN)
VALUES 
(10001,		N'ÁO THUN W2ATN2021034'),
(10001,		N'ÁO THUN W2ATN2021033'),
(10001,		N'ÁO THUN W2ATN2021030'),
(10001,		N'ÁO THUN W2ATN2021024'),
(10002,		N'ÁO THUN W2ATD120005'),
(10002,		N'ÁO THUN W2ATD110019'),
(10002,		N'ÁO THUN W2ATD110010'),
(10002,		N'ÁO THUN W2ATD110010'),
(10003,		N'SƠ MI NỮ SMG079005BU'),
(10004,		N'ÁO SOMI W1SMD2011001'),
(10004,		N'ÁO SOMI W2SMD090007'),
(10005,		N'QUẦN SHORT W2SJN1011003'),
(10005,		N'QUẦN SHORT W2SJN120003'),
(10005,		N'QUẦN SHORT W2SJN120001'),
(10006,		N'QUẦN JEAN W2QJN4011021'),
(10006,		N'QUẦN JEAN W2QJN1011017'),
(10006,		N'QUẦN JEAN W2QJN3011012'),
(10007,		N'QUẦN JOGGER W2QJJ1011001'),
(10007,		N'QUẦN JOGGER W2QJG100002'),
(10008,		N'CHÂN VÁY W2CHV2011004'),
(10008,		N'CHÂN VÁY W2CHV120002')

INSERT INTO CHITIETSANPHAM (IDSANPHAM, MAUSAC, SIZE, GIABAN)
VALUES 
(10001,		N'Đen',			'XL',		215000),
(10001,		N'Đen',			'L',		215000),
(10001,		N'Đen',			'M',		215000),
(10001,		N'Đen',			'S',		215000),
(10001,		N'Xám',			'XL',		215000),
(10001,		N'Xám',			'L',		215000),
(10001,		N'Xám',			'M',		215000),
(10001,		N'Xám',			'S',		215000),
(10001,		N'Vàng',		'XL',		215000),
(10001,		N'Vàng',		'L',		215000),
(10001,		N'Vàng',		'M',		215000),
(10001,		N'Vàng',		'S',		215000),
(10001,		N'Trắng',		'XL',		215000),
(10001,		N'Trắng',		'L',		215000),
(10001,		N'Trắng',		'M',		215000),
(10001,		N'Trắng',		'S',		215000),
(10002,		N'Đen',			'XL',		215000),
(10002,		N'Đen',			'L',		215000),
(10002,		N'Đen',			'M',		215000),
(10002,		N'Đen',			'S',		215000),
(10002,		N'Xám',			'XL',		215000),
(10002,		N'Xám',			'L',		215000),
(10002,		N'Xám',			'M',		215000),
(10002,		N'Xám',			'S',		215000),
(10002,		N'Vàng',		'XL',		215000),
(10002,		N'Vàng',		'L',		215000),
(10002,		N'Vàng',		'M',		215000),
(10002,		N'Vàng',		'S',		215000),
(10002,		N'Đỏ',			'XL',		215000),
(10002,		N'Đỏ',			'L',		215000),
(10002,		N'Đỏ',			'M',		215000),
(10002,		N'Đỏ',			'S',		215000),
(10002,		N'Trắng',		'XL',		215000),
(10002,		N'Trắng',		'L',		215000),
(10002,		N'Trắng',		'M',		215000),
(10002,		N'Trắng',		'S',		215000),
(10003,		N'Đen',			'XL',		185000),
(10003,		N'Đen',			'L',		185000),
(10003,		N'Đen',			'M',		185000),
(10003,		N'Đen',			'S',		185000),
(10003,		N'Hồng',		'XL',		185000),
(10003,		N'Hồng',		'L',		185000),
(10003,		N'Hồng',		'M',		185000),
(10003,		N'Hồng',		'S',		185000),
(10003,		N'Kem',			'XL',		185000),
(10003,		N'Kem',			'L',		185000),
(10003,		N'Kem',			'M',		185000),
(10003,		N'Kem',			'S',		185000),
(10003,		N'Trắng',		'XL',		185000),
(10003,		N'Trắng',		'L',		185000),
(10003,		N'Trắng',		'M',		185000),
(10003,		N'Trắng',		'S',		185000),
(10004,		N'Đen',			'XL',		245000),
(10004,		N'Đen',			'L',		245000),
(10004,		N'Đen',			'M',		245000),
(10004,		N'Đen',			'S',		245000),
(10004,		N'Trắng',		'XL',		245000),
(10004,		N'Trắng',		'L',		245000),
(10004,		N'Trắng',		'M',		245000),
(10004,		N'Trắng',		'S',		245000),
(10005,		N'Đen',			'XL',		245000),
(10005,		N'Đen',			'L',		245000),
(10005,		N'Đen',			'M',		245000),
(10005,		N'Đen',			'S',		245000),
(10005,		N'Xanh dương',	'XL',		245000),
(10005,		N'Xanh dương',	'L',		245000),
(10005,		N'Xanh dương',	'M',		245000),
(10005,		N'Xanh dương',	'S',		245000), 
(10005,		N'Kem',			'XL',		245000), 
(10005,		N'Kem',			'L',		245000), 
(10005,		N'Kem',			'M',		245000), 
(10005,		N'Kem',			'S',		245000), 
(10005,		N'Vàng',		'XL',		245000), 
(10005,		N'Vàng',		'L',		245000), 
(10005,		N'Vàng',		'M',		245000), 
(10005,		N'Vàng',		'S',		245000), 
(10005,		N'Đỏ',			'XL',		245000), 
(10005,		N'Đỏ',			'L',		245000), 
(10005,		N'Đỏ',			'M',		245000), 
(10005,		N'Đỏ',			'S',		245000), 
(10005,		N'Trắng',		'XL',		245000), 
(10005,		N'Trắng',		'L',		245000), 
(10005,		N'Trắng',		'M',		245000), 
(10005,		N'Trắng',		'S',		245000), 
(10006,		N'Đen',			'XL',		215000), 
(10006,		N'Đen',			'L',		215000), 
(10006,		N'Đen',			'M',		215000), 
(10006,		N'Đen',			'S',		215000), 
(10006,		N'Kem',			'XL',		215000), 
(10006,		N'Kem',			'L',		215000), 
(10006,		N'Kem',			'M',		215000), 
(10006,		N'Kem',			'S',		215000), 
(10006,		N'Đỏ',			'XL',		215000), 
(10006,		N'Đỏ',			'L',		215000), 
(10006,		N'Đỏ',			'N',		215000), 
(10006,		N'Đỏ',			'S',		215000), 
(10006,		N'Trắng',		'XL',		215000), 
(10006,		N'Trắng',		'L',		215000), 
(10006,		N'Trắng',		'M',		215000), 
(10006,		N'Trắng',		'S',		215000), 
(10007,		N'Đen',			'XL',		195000), 
(10007,		N'Đen',			'L',		195000), 
(10007,		N'Đen',			'M',		195000), 
(10007,		N'Đen',			'S',		195000), 
(10007,		N'Xanh dương',	'XL',		195000), 
(10007,		N'Xanh dương',	'L',		195000), 
(10007,		N'Xanh dương',	'M',		195000), 
(10007,		N'Xanh dương',	'S',		195000), 
(10007,		N'Hồng',		'XL',		195000), 
(10007,		N'Hồng',		'L',		195000), 
(10007,		N'Hồng',		'M',		195000), 
(10007,		N'Hồng',		'S',		195000), 
(10007,		N'Đỏ',			'XL',		195000), 
(10007,		N'Đỏ',			'L',		195000), 
(10007,		N'Đỏ',			'M',		195000), 
(10007,		N'Đỏ',			'S',		195000), 
(10007,		N'Trắng',		'XL',		195000), 
(10007,		N'Trắng',		'L',		195000), 
(10007,		N'Trắng',		'M',		195000), 
(10007,		N'Trắng',		'S',		195000), 
(10008,		N'Xanh dương',	'XL',		215000), 
(10008,		N'Xanh dương',	'L',		215000), 
(10008,		N'Xanh dương',	'M',		215000), 
(10008,		N'Xanh dương',	'S',		215000), 
(10009,		N'Kem',			'L',		245000), 
(10009,		N'Kem',			'M',		245000), 
(10009,		N'Xanh lá',		'L',		245000), 
(10009,		N'Xanh lá',		'M',		245000), 
(10009,		N'Tím',			'L',		245000), 
(10009,		N'Tím',			'M',		245000), 
(10009,		N'Hồng',		'L',		245000), 
(10009,		N'Hồng',		'M',		245000), 
(10009,		N'Vàng',		'L',		245000), 
(10009,		N'Vàng',		'M',		245000), 
(10010,		N'Trắng',		'XL',		225000), 
(10010,		N'Trắng',		'L',		225000),
(10010,		N'Trắng',		'M',		225000), 
(10010,		N'Trắng',		'S',		225000), 
(10011,		N'Hồng',		'L',		235000), 
(10011,		N'Hồng',		'M',		235000), 
(10012,		N'Kem',			'S',		215000), 
(10012,		N'Kem',			'M',		215000), 
(10012,		N'Kem',			'L',		215000), 
(10012,		N'Đen',			'S',		215000), 
(10012,		N'Đen',			'M',		215000), 
(10012,		N'Đen',			'L',		215000), 
(10012,		N'Da bò',		'S',		215000), 
(10012,		N'Da bò',		'M',		215000), 
(10012,		N'Da bò',		'L',		215000), 
(10013,		N'Đen',			'S',		285000), 
(10013,		N'Đen',			'M',		285000), 
(10013,		N'Đen',			'L',		285000), 
(10013,		N'Xanh',		'S',		285000), 
(10013,		N'Xanh',		'M',		285000), 
(10013,		N'Xanh',		'L',		285000), 
(10013,		N'Trắng',		'S',		285000), 
(10013,		N'Trắng',		'M',		285000), 
(10013,		N'Trắng',		'L',		285000), 
(10014,		N'Trắng',		'S',		315000), 
(10014,		N'Trắng',		'M',		315000), 
(10014,		N'Trắng',		'L',		315000), 
(10014,		N'Đen',			'S',		315000), 
(10014,		N'Đen',			'M',		315000), 
(10014,		N'Đen',			'L',		315000), 
(10014,		N'Xanh',		'S',		315000), 
(10014,		N'Xanh',		'M',		315000), 
(10014,		N'Xanh',		'L',		315000), 
(10015,		N'Xanh',		'S',		395000), 
(10015,		N'Xanh',		'M',		395000), 
(10015,		N'Xanh',		'L',		395000), 
(10016,		N'Đen',			'26',		440000), 
(10016,		N'Đen',			'27',		440000), 
(10016,		N'Đen',			'28',		440000), 
(10016,		N'Đen',			'29',		440000), 
(10017,		N'Xanh',		'26',		340000), 
(10017,		N'Xanh',		'27',		340000), 
(10017,		N'Xanh',		'28',		340000), 
(10017,		N'Xanh',		'29',		340000), 
(10018,		N'Đen',			'S',		395000), 
(10018,		N'Đen',			'M',		395000), 
(10018,		N'Đen',			'L',		395000), 
(10019,		N'Kem',			'S',		385000), 
(10019,		N'Kem',			'M',		385000), 
(10019,		N'Kem',			'L',		385000), 
(10019,		N'Đen',			'S',		385000), 
(10019,		N'Đen',			'M',		385000), 
(10019,		N'Đen',			'L',		385000), 
(10019,		N'Xanh',		'S',		385000), 
(10019,		N'Xanh',		'M',		385000), 
(10019,		N'Xanh',		'L',		385000), 
(10020,		N'Da bò',		'S',		225000), 
(10020,		N'Da bò',		'M',		225000), 
(10020,		N'Da bò',		'L',		225000), 
(10020,		N'Hồng',		'S',		225000), 
(10020,		N'Hồng',		'M',		225000), 
(10020,		N'Hồng',		'L',		225000), 
(10021,		N'Trắng',		'S',		315000), 
(10021,		N'Trắng',		'M',		315000), 
(10021,		N'Trắng',		'L',		315000), 
(10021,		N'Xanh',		'S',		315000), 
(10021,		N'Xanh',		'M',		315000), 
(10021,		N'Xanh',		'L',		315000)

INSERT INTO ANHSANPHAM (IDCHITIETSANPHAM, TENANH)
VALUES 
(10001,		'2906202130655_IMG_4419.jpg'),
(10002,		'2906202130655_IMG_4419.jpg'),
(10003,		'2906202130655_IMG_4419.jpg'),
(10004,		'2906202130655_IMG_4419.jpg'),
(10005,		'2907202130708_IMG_4417.jpg'),
(10006,		'2907202130708_IMG_4417.jpg'),
(10007,		'2907202130708_IMG_4417.jpg'),
(10008,		'2907202130708_IMG_4417.jpg'),
(10009,		'2906202130641_IMG_4418.jpg'),
(10010,		'2906202130641_IMG_4418.jpg'),
(10011,		'2906202130641_IMG_4418.jpg'),
(10012,		'2906202130641_IMG_4418.jpg'),
(10013,		'2907202130722_IMG_4420.jpg'),
(10014,		'2907202130722_IMG_4420.jpg'),
(10015,		'2907202130722_IMG_4420.jpg'),
(10016,		'2907202130722_IMG_4420.jpg'),
(10017,		'2922202132212_IMG_4423.jpg'),
(10018,		'2922202132212_IMG_4423.jpg'),
(10019,		'2922202132212_IMG_4423.jpg'),
(10020,		'2922202132212_IMG_4423.jpg'),
(10021,		'2922202132242_IMG_4421.jpg'),
(10022,		'2922202132242_IMG_4421.jpg'),
(10023,		'2922202132242_IMG_4421.jpg'),
(10024,		'2922202132242_IMG_4421.jpg'),
(10025,		'2922202132227_IMG_4422.jpg'),
(10026,		'2922202132227_IMG_4422.jpg'),
(10027,		'2922202132227_IMG_4422.jpg'),
(10028,		'2922202132227_IMG_4422.jpg'),
(10029,		'2922202132200_IMG_4424.jpg'),
(10030,		'2922202132200_IMG_4424.jpg'),
(10031,		'2922202132200_IMG_4424.jpg'),
(10032,		'2922202132200_IMG_4424.jpg'),
(10033,		'2922202132257_IMG_4425.jpg'),
(10034,		'2922202132257_IMG_4425.jpg'),
(10035,		'2922202132257_IMG_4425.jpg'),
(10036,		'2922202132257_IMG_4425.jpg'),
(10037,		'2909202130914_IMG_4408.jpg'),
(10038,		'2909202130914_IMG_4408.jpg'),
(10039,		'2909202130914_IMG_4408.jpg'),
(10040,		'2909202130914_IMG_4408.jpg'),
(10041,		'2909202130941_IMG_4407.jpg'),
(10042,		'2909202130941_IMG_4407.jpg'),
(10043,		'2909202130941_IMG_4407.jpg'),
(10044,		'2909202130941_IMG_4407.jpg'),
(10045,		'2909202130903_IMG_4409.jpg'),
(10046,		'2909202130903_IMG_4409.jpg'),
(10047,		'2909202130903_IMG_4409.jpg'),
(10048,		'2909202130903_IMG_4409.jpg'),
(10049,		'2909202130929_IMG_4410.jpg'),
(10050,		'2909202130929_IMG_4410.jpg'),
(10051,		'2909202130929_IMG_4410.jpg'),
(10052,		'2909202130929_IMG_4410.jpg'),
(10053,		'153202145310_IMG_3801.jpg'),
(10054,		'153202145310_IMG_3801.jpg'),
(10055,		'153202145310_IMG_3801.jpg'),
(10056,		'153202145310_IMG_3801.jpg'),
(10057,		'153202145322_IMG_3800.jpg'),
(10058,		'153202145322_IMG_3800.jpg'),
(10059,		'153202145322_IMG_3800.jpg'),
(10060,		'153202145322_IMG_3800.jpg'),
(10061,		'9152021111520_IMG_2790.jpg'),
(10062,		'9152021111520_IMG_2790.jpg'),
(10063,		'9152021111520_IMG_2790.jpg'),
(10064,		'9152021111520_IMG_2790.jpg'),
(10065,		'9152021111505_IMG_2791.jpg'),
(10066,		'9152021111505_IMG_2791.jpg'),
(10067,		'9152021111505_IMG_2791.jpg'),
(10068,		'9152021111505_IMG_2791.jpg'),
(10069,		'9152021111513_IMG_2788.jpg'),
(10070,		'9152021111513_IMG_2788.jpg'),
(10071,		'9152021111513_IMG_2788.jpg'),
(10072,		'9152021111513_IMG_2788.jpg'),
(10073,		'9142021111452_IMG_2792.jpg'),
(10074,		'9142021111452_IMG_2792.jpg'),
(10075,		'9142021111452_IMG_2792.jpg'),
(10076,		'9142021111452_IMG_2792.jpg'),
(10077,		'9152021111534_IMG_2789.jpg'),
(10078,		'9152021111534_IMG_2789.jpg'),
(10079,		'9152021111534_IMG_2789.jpg'),
(10080,		'9152021111534_IMG_2789.jpg'),
(10081,		'9152021111526_IMG_2793.jpg'),
(10082,		'9152021111526_IMG_2793.jpg'),
(10083,		'9152021111526_IMG_2793.jpg'),
(10084,		'9152021111526_IMG_2793.jpg'),
(10085,		'IMG_8862.jpg'),
(10086,		'IMG_8862.jpg'),
(10087,		'IMG_8862.jpg'),
(10088,		'IMG_8862.jpg'),
(10089,		'IMG_8864.jpg'),
(10090,		'IMG_8864.jpg'),
(10091,		'IMG_8864.jpg'),
(10092,		'IMG_8864.jpg'),
(10093,		'IMG_8863.jpg'),
(10094,		'IMG_8863.jpg'),
(10095,		'IMG_8863.jpg'),
(10096,		'IMG_8863.jpg'),
(10097,		'IMG_8865.jpg'),
(10098,		'IMG_8865.jpg'),
(10099,		'IMG_8865.jpg'),
(10100,		'IMG_8865.jpg'),
(10101,		'IMG_8834.jpg'),
(10102,		'IMG_8834.jpg'),
(10103,		'IMG_8834.jpg'),
(10104,		'IMG_8834.jpg'),
(10105,		'IMG_8830.jpg'),
(10106,		'IMG_8830.jpg'),
(10107,		'IMG_8830.jpg'),
(10108,		'IMG_8830.jpg'),
(10109,		'IMG_8832.jpg'),
(10110,		'IMG_8832.jpg'),
(10111,		'IMG_8832.jpg'),
(10112,		'IMG_8832.jpg'),
(10113,		'IMG_8831.jpg'),
(10114,		'IMG_8831.jpg'),
(10115,		'IMG_8831.jpg'),
(10116,		'IMG_8831.jpg'),
(10117,		'IMG_8835.jpg'),
(10118,		'IMG_8835.jpg'),
(10119,		'IMG_8835.jpg'),
(10120,		'IMG_8835.jpg'),
(10121,		'somi-nu-cham-bi-totoshop (2).jpg'),
(10122,		'somi-nu-cham-bi-totoshop (2).jpg'),
(10123,		'somi-nu-cham-bi-totoshop (2).jpg'),
(10124,		'somi-nu-cham-bi-totoshop (2).jpg'),
(10125,		'159202115929_IMG_2455.jpg'),
(10126,		'159202115929_IMG_2455.jpg'),
(10127,		'158202115836_IMG_2450.jpg'),
(10128,		'158202115836_IMG_2450.jpg'),
(10129,		'158202115853_IMG_2449.jpg'),
(10130,		'158202115853_IMG_2449.jpg'),
(10131,		'157202115704_IMG_2453.jpg'),
(10132,		'157202115704_IMG_2453.jpg'),
(10133,		'159202115913_IMG_2452.jpg'),
(10134,		'159202115913_IMG_2452.jpg'),
(10135,		'IMG (23).jpg'),
(10136,		'IMG (23).jpg'),
(10137,		'IMG (23).jpg'),
(10138,		'IMG (23).jpg'),
(10139,		'AO_SOMI_W2SMD090003_(5_Do_nhap).jpg'),
(10140,		'AO_SOMI_W2SMD090003_(5_Do_nhap).jpg'),
(10141,		'146202124618_IMG_3761.jpg'),
(10142,		'146202124618_IMG_3761.jpg'),
(10143,		'146202124618_IMG_3761.jpg'),
(10144,		'146202124640_IMG_3762.jpg'),
(10145,		'146202124640_IMG_3762.jpg'),
(10146,		'146202124640_IMG_3762.jpg'),
(10147,		'146202124658_IMG_3760.jpg'),
(10148,		'146202124658_IMG_3760.jpg'),
(10149,		'146202124658_IMG_3760.jpg'),
(10150,		'4412021114148_IMG_1931.jfif'),
(10151,		'4412021114148_IMG_1931.jfif'),
(10152,		'4412021114148_IMG_1931.jfif'),
(10153,		'4412021114153_IMG_1927.jfif'),
(10154,		'4412021114153_IMG_1927.jfif'),
(10155,		'4412021114153_IMG_1927.jfif'),
(10156,		'4412021114143_IMG_1930.jfif'),
(10157,		'4412021114143_IMG_1930.jfif'),
(10158,		'4412021114143_IMG_1930.jfif'),
(10159,		'9422021114247_IMG_1916.jfif'),
(10160,		'9422021114247_IMG_1916.jfif'),
(10161,		'9422021114247_IMG_1916.jfif'),
(10162,		'9422021114256_IMG_1915.jfif'),
(10163,		'9422021114256_IMG_1915.jfif'),
(10164,		'9422021114256_IMG_1915.jfif'),
(10165,		'9432021114309_IMG_1917.jfif'),
(10166,		'9432021114309_IMG_1917.jfif'),
(10167,		'9432021114309_IMG_1917.jfif'),
(10168,		'153202125312_IMG_3767.jpg'),
(10169,		'153202125312_IMG_3767.jpg'),
(10170,		'153202125312_IMG_3767.jpg'),
(10171,		'23202021112030_IMG_2425.jpg'),
(10172,		'23202021112030_IMG_2425.jpg'),
(10173,		'23202021112030_IMG_2425.jpg'),
(10174,		'23202021112030_IMG_2425.jpg'),
(10175,		'23112021111139_IMG_2417.jpg'),
(10176,		'23112021111139_IMG_2417.jpg'),
(10177,		'23112021111139_IMG_2417.jpg'),
(10178,		'23112021111139_IMG_2417.jpg'),
(10179,		'23272021112722_IMG_2383.jpg'),
(10180,		'23272021112722_IMG_2383.jpg'),
(10181,		'23272021112722_IMG_2383.jpg'),
(10182,		'IMG_2607.jpg'),
(10183,		'IMG_2607.jpg'),
(10185,		'IMG_2610.jpg'),
(10186,		'IMG_2610.jpg'),
(10187,		'IMG_2610.jpg'),
(10188,		'IMG_2612.jpg'),
(10189,		'IMG_2612.jpg'),
(10190,		'IMG_2612.jpg'),
(10191,		'143202124326_IMG_3757.jpg'),
(10192,		'143202124326_IMG_3757.jpg'),
(10193,		'143202124326_IMG_3757.jpg'),
(10194,		'143202124312_IMG_3758.jpg'),
(10195,		'143202124312_IMG_3758.jpg'),
(10196,		'143202124312_IMG_3758.jpg'),
(10197,		'9402021114033_IMG_1924.jfif'),
(10198,		'9402021114033_IMG_1924.jfif'),
(10199,		'9402021114033_IMG_1924.jfif'),
(10200,		'9402021114027_IMG_1923.jfif'),
(10201,		'9402021114027_IMG_1923.jfif'),
(10202,		'9402021114027_IMG_1923.jfif')

INSERT INTO NHANVIEN (HOTEN, NGAYSINH, GIOITINH, DIACHI, SODIENTHOAI, EMAIL, CHUCVU, MUCLUONG, ANHDAIDIEN, MATKHAU)
VALUES 
(N'Nguyễn Quang Ngọc', '01-01-2001', 1, N'Hà Nội', '0345678901', 'ngoc@gmail.com', N'NHÂN VIÊN BÁN HÀNG', 5000000, 'ngocnq.jpg', '12345678'),
(N'Đỗ Văn Duy', '01-01-2001', 1, N'Hà Nam', '0345678901', 'duy@gmail.com', N'NHÂN VIÊN THU NGÂN', 5500000, 'duydv.jpg', '12345678'),
(N'Bùi Việt Đức', '01-01-2001', 1, N'Quảng Ninh', '0345678901', 'duc@gmail.com', N'QUẢN LÝ', 5500000, 'ducbv.jpg', '12345678'),
(N'Hoàng Hồng Quang', '01-01-2001', 1, N'Quảng Trị', '0345678901', 'quang@gmail.com', N'NHÂN VIÊN BÁN HÀNG', 5500000, 'quanghq.jpg', '12345678'),
(N'Nguyễn Đức Thành', '01-01-2001', 1, N'Thanh Hóa', '0345678901', 'thanh@gmail.com', N'NHÂN VIÊN BÁN HÀNG', 5500000, 'thanhnd.jpg', '12345678'),
(N'Hoàng Quốc Huy', '01-01-2001', 1, N'Nghệ An', '0345678901', 'huy@gmail.com', N'NHÂN VIÊN BÁN HÀNG', 5500000, 'huynq.jpg', '12345678')

INSERT INTO KHACHHANG (HOTEN, SODIENTHOAI, DIACHI, TICHDIEM)
VALUES 
(N'ADMIN', '88888888', N'ADMIN', 0),
(N'Đỗ Văn Duy', '0345678912', N'', 0),
(N'Nguyễn Quang Ngọc', '0345678912', '', 0),
(N'Bùi Việt Đức', '0345678912', N'Hoàn Kiếm', 0),
(N'Nguyễn Đức Thành', '0345678912', '', 0)

INSERT INTO NGUONHANG (TEN, SODIENTHOAI, DIACHI)
VALUES 
(N'Nhà may kinh đô', '18008198', N'Nam Từ Liêm'),
(N'Nhà may amy', '18008199', N'Hai Bà Trưng')

INSERT INTO HOADONTRAHANG(IDNHANVIEN, GHICHU)
VALUES (10001, N'REVIEW TRẢ')