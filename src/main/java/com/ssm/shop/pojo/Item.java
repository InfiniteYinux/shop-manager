package com.ssm.shop.pojo;

public class Item {
    private Long id;

    private String title;
    private String discount;
    private String saleprice;
    private String oldprice;
    private String shopname;
    private String description;
    private String imageurl;
    private String itemurl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getOldprice() {
		return oldprice;
	}

	public void setOldprice(String oldprice) {
		this.oldprice = oldprice;
	}

	public String getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(String saleprice) {
		this.saleprice = saleprice;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemurl() {
		return itemurl;
	}

	public void setItemurl(String itemurl) {
		this.itemurl = itemurl;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}


   

}