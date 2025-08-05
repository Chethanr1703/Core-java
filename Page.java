class Page{
	int pageId;
	int noOfpage;
	int noOflines;
	Article article;
	
	Page(int pageId,int noOfpage,int noOflines,Article article){
		this.pageId=pageId;
		this.noOfpage=noOfpage;
		this.noOflines=noOflines;
		this.article=article;
	}
	
	public void getPageinfo(){
		System.out.println("fetching page Info ------");
		System.out.println("the id of the page is :"+pageId);
		System.out.println("the noOfpage of the page is :"+noOfpage);
		System.out.println("the noOflines of the page is :"+noOflines);
this.article.getArticleInfo();
	}
}