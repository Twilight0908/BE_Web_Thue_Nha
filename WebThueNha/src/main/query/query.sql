# 14:00 06/09
create database web_thue_nha;

use web_thue_nha;

insert into role(name)
values ('ROLE_ADMIN');
insert into role(name)
values ('ROLE_USER');

select *
from role;

insert into account(password, username, role_id)
values ('admin', 'admin', 1);
insert into account(password, username, role_id)
values ('user', 'user', 2);

select *
from account;

# 20:00 06/09

insert into category (name)
values ('Phòng trọ'),
       ('Chung cư mini'),
       ('Chung cư'),
       ('Homestay');

insert into area (name)
values ('Hà Nội'),
       ('TP Hồ Chí Minh'),
       ('Đà Nẵng'),
       ('Đà Lạt');


insert into room (address, detail, image_main, number_of_rooms, number_of_wc_rooms,
                  price, square, status, title, area_id, category_id)
values ('143A Cầu Giấy, Ngọc Khánh, Ba Đình',
        'Nội thất trong căn hộ: Tivi, máy lạnh, rèm cửa, sofa, bàn ăn, kệ tivi, tủ lạnh, máy lạnh, giường ngủ, tủ quần áo,
        bếp từ, máy hút mùi, tủ bếp, bồn rửa, vòi sen, lavabo, gương, máy nước nóng, tủ chứa đồ, kệ để vật dụng, máy giặt, giá để quần áo.
        Nội thất được trang bị đẹp, mới 100% và cao cấp, Anh/Chị chỉ cần xách vali vào là ở, tiện nghi không thiếu thứ gì',
        'https://pt123.cdn.static123.com/images/thumbs/900x600/fit/2023/03/25/phong-tro-tphcm_1679716618.jpg',
        2 , 1, '60', 20.5, 'Còn phòng', 'CĂN HỘ 2PN: FULL NỘI THẤT CAO CẤP - NHÀ MỚI, RẤT ĐẸP', 1, 1),
        ('122A Ngọc Hà, Ngọc Khánh, Ba Đình',
        'Căn 2PN - 2WC, diện tích 70m.
        Nội thất cơ bản.',
        'https://pt123.cdn.static123.com/images/thumbs/900x600/fit/2023/03/25/phong-tro-tphcm_1679716618.jpg',
        2 , 1, '30', 32.3, 'Còn phòng', 'CĂN HỘ CHUNG CƯ THE WESTERN CAPITAL - NƠI Ở LÝ TƯỞNG THỜI ĐẠI', 1, 1),
        ('20 Trương Định, Hai Bà Trưng, Hà Nội',
        '1PN bếp kiểu xa giường, Phòng 40m2 có máy giặt riêng có ban công thoáng mát',
        'https://cdn.luatvietnam.vn/uploaded/Images/Original/2022/09/05/mau-hop-dong-thue-tro-2022-1_0509150415.jpg',
        3 , 2, '70', 22.3, 'Còn phòng', 'CĂN HỘ 1PN TRUNG TÂM FULL NỘI THẤT SIÊU XỊN', 2, 1),
        ('20 Trương Định, Hai Bà Trưng, Hà Nội',
        '1PN bếp kiểu xa giường, Phòng 40m2 có máy giặt riêng có ban công thoáng mát',
        'https://cdn.luatvietnam.vn/uploaded/Images/Original/2022/09/05/mau-hop-dong-thue-tro-2022-1_0509150415.jpg',
        3 , 2, '70', 22.3, 'Còn phòng', 'CĂN HỘ 1PN TRUNG TÂM FULL NỘI THẤT SIÊU XỊN', 2, 1),
        ('Đường Lạc Long Quân, Phường Nghĩa Đô, Quận Cầu Giấy',
         'Chung cư mini dầy đủ tiện nghi ERA APARTMEN mới hoàn thiện PHỐ LẠC LONG QUÂN',
         'https://cdn.chotot.com/eZ4To0_syHSM7j0ccSJ_IWB4pD3adsEYOZ_IyQc3tA8/preset:view/plain/5fe5f9449975211ec41c1d82e8a48641-2799711980390747863.jpg',
        1 , 1, '300', 45, 'Còn phòng', ' CHUNG CƯ MINI LẠC LONG QUÂN 40M2 ĐẦY ĐỦ ĐỒ 1K1N GẦN CHỢ BƯỞI', 1, 2),
        ('Thông Thiên Học, Phường 2',
         'Căn hộ dịch vụ, mini tiện ích với đầy đủ trang thiết bị
        và đồ dùng nhà bếp. Smart TV, lò vi sóng, bếp từ, tủ lạnh, nồi niêu xoong chảo đũa muỗng',
        'https://cdn.chotot.com/Z5MaNjEgdoDPmGNfaPhu8YjGrNO1WZYAGkhoE7nbWAo/preset:view/plain/f8014b8dcc15a6eecbfecefd79fdafde-2838700468156761459.jpg',
        1 , 1, '200', 35, 'Còn phòng', 'CĂN HỘ DỊCH VỤ MINI GIÁ CẢ PHÙ HỢP, VIEW SIÊU ĐẸP', 4, 2),
        ('Phường 11, Quận Phú Nhuận',
        'Nhà 1 phòng ngủ riêng, phòng khách rộng,
        có ban công và cửa sổ lớn, 1 nhà vệ sinh, 1 nhà bếp rộng,
        Lầu 6 yên tĩnh, có cửa sổ to thoáng mát,Chỉ mất 5p đi các quận trung tâm, sân bay',
        'https://cdn.chotot.com/MdCZmMLEJztgDJ4Ia68UHTwLACwc7_D94aC5_28oKS4/preset:view/plain/5d46092e45bd7072e618fea2255bf6aa-2837234449868773222.jpg',
        1 , 1, '400', 60, 'Còn phòng', 'CĂN HỘ 60M, 1 PHÒNG NGỦ, 1 PHÒNG KHÁCH RỘNG TỌA LẠC TẠI TRUNG TÂM THÀNH PHỐ', 2, 3),
        ('Hòa Khánh Bắc, Liên Chiểu',
        'Dịch vụ Check-in sớm.
        Thu đổi ngoại tệ,
        Lễ tân và bảo vệ 24h.
        Giặt ủi.
        Lưu trữ và bảo quản hành lý.
        Dịch vụ hỗ trợ đặt tour',
        'https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1b/65/d1/63/bolero-hotel-homestay.jpg?w=700&h=-1&s=1',
        1 , 1, '50', 30, 'Còn phòng', 'BOLERO HOTEL & HOMESTAY, SỰ LỰA CHỌN SỐ 1', 3, 4);


