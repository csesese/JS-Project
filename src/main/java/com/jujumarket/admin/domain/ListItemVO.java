package com.jujumarket.admin.domain;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class ListItemVO {
	
	private String itemCode;
	private String itemName;
	private String itemContent;
	private int price;
	private int normPrice;
	private int stock;
	private String dispStat;
	private String saleStat;
	private String itemChr;
	private String itemImg1;
	private String itemImg2;
	private String itemImg3;
	private String itemImg4;
	private String imgDetail;
	private Timestamp regDate;
	private Timestamp updateDate;
	private String classCode;
	private String idNo;
	private String shopName;

	
}
