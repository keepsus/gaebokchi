drop table t_shopping_member;
drop table t_shopping_goods;
drop table t_shopping_order;
drop table t_shopping_cart;
drop table t_shopping_qna;


--------------------------------------------------------
--  DDL for Table T_SHOPPING_GOODS	--상품정보
--------------------------------------------------------

create table t_shopping_goods
(
seq               number,                      --seq
goods_id          varchar2(50),	              --상품코드
goods_title       varchar2(100),               --상품명
goods_country     varchar2(40) default '한국',  --원산지
goods_price       number(10,0),                --상품정가
goods_sales_price number(10,0),                --상품판매가격
goods_qty         number(10,0),                --상품개수
goods_point       number(10,0) default 500,    --상품포인트
goods_deli_price  number(10,0) default 1500,   --배송비
goods_deli_extra  number(10,0) default 1000,   --산간배송비
goods_deli_free   number(10,0) default 10000,  --조건부무료배송
goods_image0      varchar2(40),                --제품이미지
goods_image1      varchar2(40),                --제품이미지
goods_content     varchar2(2000),              --상품설명
goods_sales_yn    number(10,0) default 0,      --sale on/off
goods_md_yn       number(10,0) default 0,      --md on/off
goods_hot_yn      number(10,0) default 0,      --hot on/off
goods_soldout_yn  number(10,0) default 0,      --soldout on/off
logtime           date default sysdate         --작성일
) ;

create sequence seq_t_shopping_goods nocache nocycle;

--------------------------------------------------------
--  DDL for Table T_SHOPPING_MEMBER	--회원정보
--------------------------------------------------------

CREATE TABLE T_SHOPPING_MEMBER
(
MEMBER_ID VARCHAR2(20 BYTE) primary key,	--회원아이디
MEMBER_PW VARCHAR2(30 BYTE),	--비밀번호
MEMBER_NAME VARCHAR2(50 BYTE),--회원이름
TEL1 VARCHAR2(20 BYTE),			--유선전화번호1
TEL2 VARCHAR2(20 BYTE),			--유선전화번호2
TEL3 VARCHAR2(20 BYTE),			--유선전화번호3
EMAIL1 VARCHAR2(20 BYTE),		--이메일주소1
EMAIL2 VARCHAR2(20 BYTE),		--이메일주소2
EMAIL_KEY VARCHAR2(20 BYTE),	--EMAILSTS_YN(이메일수신여부) -> "EMAILKEY"(이메일인증여부)
ZIPCODE VARCHAR2(20 BYTE),		--우편번호
ADDR1 VARCHAR2(500 BYTE),		--ROADADDRESS -> ADDR1
ADDR2 VARCHAR2(500 BYTE),		--JIBUNADDRESS -> ADDR2

--추가사항--
ADMIN_YN VARCHAR2(20 BYTE),	--관리자 계정 권한
LOGTIME	DATE					   --작성일
) ;
--------------------------------------------------------
--  DDL for Table T_SHOPPING_ORDER	--주문테이블
--------------------------------------------------------

  CREATE TABLE T_SHOPPING_ORDER
  (ORDER_SEQ_NUM NUMBER(20,0) primary key,
   ORDER_ID NUMBER(20,0),            
   MEMBER_ID VARCHAR2(20 BYTE),  
   GOODS_ID NUMBER(20,0),       
   GOODS_TITLE VARCHAR2(100 BYTE),
   ORDER_GOODS_QTY NUMBER(5,0),
   GOODS_FILENAME VARCHAR2(60 BYTE),
   ORDERER_NAME VARCHAR2(50 BYTE),
   ORDERER_HP VARCHAR2(50 BYTE),
   ORDERER_EMAIL VARCHAR2(300 BYTE),
   RECEIVER_NAME VARCHAR2(50 BYTE),
   RECEIVER_HP VARCHAR2(60 BYTE),
   DELIVERY_ZIPCODE VARCHAR2(20 BYTE),
   DELIVERY_ADDR1 VARCHAR2(500 BYTE),
   DELIVERY_ADDR2 VARCHAR2(500 BYTE),
   DELIVERY_MESSAGE VARCHAR2(300 BYTE),
   ORDER_GOODS_PRICE NUMBER(5,0),
   ORDER_DELIVERY_PRICE NUMBER(5,0),
   GOODS_SALES_PRICE NUMBER(5,0), 
   TOTAL_ORDER_PRICE NUMBER(5,0), 
   ORDER_AGREEMENT_INFO NUMBER(5,0), 
   ORDER_AGREEMENT_ORDER NUMBER(5,0), 
   PAY_METHOD VARCHAR2(200 BYTE), 
   DELIVERY_METHOD VARCHAR2(40 BYTE), 
   GIFT_WRAPPING VARCHAR2(20 BYTE),
   CARD_COM_NAME VARCHAR2(50 BYTE), 
   CARD_PAY_MONTH VARCHAR2(20 BYTE), 
   PAY_ORDERER_HP_NUM VARCHAR2(20 BYTE), 
   DELIVERY_STATE VARCHAR2(20 BYTE) DEFAULT 'delivery_prepared',
   PAY_ORDER_TIME DATE DEFAULT sysdate,

   --추가사항--
   USER_ORDER_STATUS VARCHAR2(50 BYTE),	--주문자가 취소/교환/환불 신청
   ORDER_STATUS_REPLY VARCHAR2(50 BYTE), ---주문자가 취소/교환/환불 신청에 대한 관리자 응답

  ) ;
--------------------------------------------------------
--  DDL for Table T_SHOPPING_CART	--장바구니
--------------------------------------------------------

  CREATE TABLE T_SHOPPING_CART 
   (
   CART_ID NUMBER(10,0) primary key,	--장바구니번호
	GOODS_ID VARCHAR2(50 BYTE),		--상품번호
	MEMBER_ID VARCHAR2(20 BYTE),		--회원아이디
	CART_GOODS_QTY NUMBER(4,0) DEFAULT 1	--상품개수
	CREATE TABLE T_SHOPPING_CART                  --생성일자
   ) ;

--"DEL_YN" VARCHAR2(20 BYTE) DEFAULT 'N',	--회원탈퇴유무, 이게 여기 왜 있나????
--------------------------------------------------------
--  DDL for Table T_SHOPPING_QNA	--QNA
--------------------------------------------------------
CREATE TABLE T_SHOPPING_QNA
(
SEQ	NUMBER PRIMARY KEY,	--글번호(seq 객체 이용)
MEMBER_ID VARCHAR2(20) NOT NULL,
SUBJECT  VARCHAR2(255) NOT NULL,
CONTENT	VARCHAR2(4000) NOT NULL,
REF	NUMBER NOT NULL,
LEV	NUMBER DEFAULT 0 NOT NULL,
STEP NUMBER DEFAULT 0 NOT NULL,
PSEQ NUMBER DEFAULT 0 NOT NULL,
REPLY NUMBER DEFAULT 0 NOT NULL,
HIT	NUMBER DEFAULT 0,
LOGTIME	DATE DEFAULT SYSDATE
);

create sequence seq_qna nocache nocycle;

-------------------------------------------------
답변
-------------------------------------------------
create table qna_reply (
    seq number not null,
    rno number not null,-- 댓글번호
    content varchar2(1000) not null,
    writer varchar2(50) not null,
    regdate date default sysdate,
    primary key(seq, rno)
);

alter table qna_reply add constraint qna_reply_seq foreign key(seq) references T_SHOPPING_QNA(seq);

create sequence qna_reply_seq start with 1 minvalue 0;

commit;


--------------------------------------------------------
--  DDL for Table T_SHOPPING_STAR	--별점
--------------------------------------------------------
CREATE TABLE T_SHOPPING_STAR
(
SEQ	NUMBER,
GOODS_ID number (20,0),			
MEMBER_ID VARCHAR2(20 BYTE),
REVIEW_CONTEXT VARCHAR2(4000 BYTE),
REVIEW_SCORE VARCHAR2(20 BYTE),
CREDATE DATE DEFAULT sysdate
);



--------------------------------------------------------
--  DDL for Table newzipcode	--우편번호
--------------------------------------------------------
CREATE TABLE newzipcode
(
ZIPCODE	NUMBER(38,0),
SIDO	VARCHAR2(26 BYTE),
SIGUNGU	VARCHAR2(26 BYTE),
YUBMYUNDONG	VARCHAR2(26 BYTE),
RI	VARCHAR2(26 BYTE),
ROADNAME	VARCHAR2(26 BYTE),
BUILDINGNAME	VARCHAR2(26 BYTE)
);
--------------------------------------------------------

drop sequence ORDER_SEQ_NUM;
drop sequence SEQ_GOODS_ID;
drop sequence SEQ_IMAGE_ID;
drop sequence SEQ_ORDER_ID;
--------------------------------------------------------
--  DDL for Sequence ORDER_SEQ_NUM
--------------------------------------------------------

   CREATE SEQUENCE  "ORDER_SEQ_NUM"  MINVALUE 0 MAXVALUE 10000000 INCREMENT BY 1 START WITH 400 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_GOODS_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_GOODS_ID"  MINVALUE 100 MAXVALUE 1000000 INCREMENT BY 1 START WITH 400 CACHE 20 ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_IMAGE_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_IMAGE_ID"  MINVALUE 1 MAXVALUE 11111111 INCREMENT BY 1 START WITH 400 NOCACHE  NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_ORDER_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_ORDER_ID"  MINVALUE 0 MAXVALUE 10000000 INCREMENT BY 1 START WITH 400 NOCACHE  ORDER  NOCYCLE ;
