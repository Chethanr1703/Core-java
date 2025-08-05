class Article{
	int articleId;
	String writer;
	int noOflines;
	
	Article(int articleId,String writer,int noOflines){
		this.articleId=articleId;
		this.writer=writer;
		this.noOflines=noOflines;
	}
	public void getArticleInfo(){
		System.out.println("fetching article info-----");
		System.out.println("the id of the article is :"+articleId);
		System.out.println("the writer of the article is :"+writer);
		System.out.println("the noOflines of the article is :"+noOflines);


	}
	
}