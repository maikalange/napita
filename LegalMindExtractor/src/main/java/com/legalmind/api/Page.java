/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.legalmind.api;

/**
 *
 * @author jnj
 */
public class Page {
    private final int pageNo;
    private String content;
    public Page(int pageNo, String content){
        this.pageNo = pageNo;
        this.content  = content;
    }
    
    public String getContent(){
        return content;
    }
    
    public void setContent(String content){
        this.content  = content;
    }
    
    public int getPageNo(){
        return pageNo;
    }
}
