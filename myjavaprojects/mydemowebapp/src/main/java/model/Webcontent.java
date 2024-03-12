package model;

public class Webcontent {

	protected int id;
	private String feature_title, feature_para, faq_question, faq_answer,about_title, aboutus_desc,home_title,home_para;

	public Webcontent() {
	}
	
	public Webcontent(int id, String feature_title, String feature_para,
			String faq_question, String faq_answer, String about_title, String aboutus_desc, String home_title, String home_para) {
		super();
		this.id = id;
		this.feature_title = feature_title;
		this.feature_para = feature_para;
		this.faq_question = faq_question;
		this.faq_answer = faq_answer;
		this.about_title = about_title;
		this.aboutus_desc = aboutus_desc;
		this.home_title = home_title;
		this.home_para = home_para;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the feature_title
	 */
	public String getFeature_title() {
		return feature_title;
	}

	/**
	 * @param feature_title the feature_title to set
	 */
	public void setFeature_title(String feature_title) {
		this.feature_title = feature_title;
	}

	/**
	 * @return the feature_para
	 */
	public String getFeature_para() {
		return feature_para;
	}

	/**
	 * @param feature_para the feature_para to set
	 */
	public void setFeature_para(String feature_para) {
		this.feature_para = feature_para;
	}

	/**
	 * @return the faq_question
	 */
	public String getFaq_question() {
		return faq_question;
	}

	/**
	 * @param faq_question the faq_question to set
	 */
	public void setFaq_question(String faq_question) {
		this.faq_question = faq_question;
	}

	/**
	 * @return the faq_answer
	 */
	public String getFaq_answer() {
		return faq_answer;
	}

	/**
	 * @param faq_answer the faq_answer to set
	 */
	public void setFaq_answer(String faq_answer) {
		this.faq_answer = faq_answer;
	}

	/**
	 * @return the about_title
	 */
	public String getAbout_title() {
		return about_title;
	}

	/**
	 * @param about_title the about_title to set
	 */
	public void setAbout_title(String about_title) {
		this.about_title = about_title;
	}

	/**
	 * @return the aboutus_desc
	 */
	public String getAboutus_desc() {
		return aboutus_desc;
	}

	/**
	 * @param aboutus_desc the aboutus_desc to set
	 */
	public void setAboutus_desc(String aboutus_desc) {
		this.aboutus_desc = aboutus_desc;
	}

	/**
	 * @return the home_title
	 */
	public String getHome_title() {
		return home_title;
	}

	/**
	 * @param home_title the home_title to set
	 */
	public void setHome_title(String home_title) {
		this.home_title = home_title;
	}

	/**
	 * @return the home_para
	 */
	public String getHome_para() {
		return home_para;
	}

	/**
	 * @param home_para the home_para to set
	 */
	public void setHome_para(String home_para) {
		this.home_para = home_para;
	}
	
}
