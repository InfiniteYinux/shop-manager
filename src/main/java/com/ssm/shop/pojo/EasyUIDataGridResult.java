package com.ssm.shop.pojo;

import java.util.List;

public class EasyUIDataGridResult {

    private Integer total;

    private List<?> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

	@Override
	public String toString() {
		return "EasyUIDataGridResult [total=" + total + ", rows=" + rows + "]";
	}

}