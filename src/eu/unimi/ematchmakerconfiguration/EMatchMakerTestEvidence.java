package eu.unimi.ematchmakerconfiguration;


/**
 * @author Jonatan
 *
 */
public class EMatchMakerTestEvidence {
	private String testCategory;
	private String testType;
	private QualityLevel testEvidenceQualityLevel;
	private EvidenceWeight weight;
	private int cardinality;
	
	/**
	 * @return the testCategory
	 */
	public String getTestCategory() {
		return testCategory;
	}
	
	/**
	 * @param testCategory the testCategory to set
	 */
	public void setTestCategory(String testCategory) {
		this.testCategory = testCategory;
	}
	
	/**
	 * @return the testType
	 */
	public String getTestType() {
		return testType;
	}
	
	/**
	 * @param testType the testType to set
	 */
	public void setTestType(String testType) {
		this.testType = testType;
	}
	
	/**
	 * @return the testEvidenceQualityLevel
	 */
	public QualityLevel getTestEvidenceQualityLevel() {
		return testEvidenceQualityLevel;
	}
	
	/**
	 * @param testEvidenceQualityLevel the testEvidenceQualityLevel to set
	 */
	public void setTestEvidenceQualityLevel(QualityLevel testEvidenceQualityLevel) {
		this.testEvidenceQualityLevel = testEvidenceQualityLevel;
	}
	
	/**
	 * @return the cardinality
	 */
	public int getCardinality() {
		return cardinality;
	}
	
	/**
	 * @param cardinality the cardinality to set
	 */
	public void setCardinality(int cardinality) {
		this.cardinality = cardinality;
	}
	
	/**
	 * @return the weight
	 */
	public EvidenceWeight getWeight() {
		return weight;
	}
	
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(EvidenceWeight weight) {
		this.weight = weight;
	}
	
	/**
	 * @param testCategory
	 * @param testType
	 * @param testEvidenceQualityLevel
	 * @param weight
	 * @param cardinality
	 */
	public EMatchMakerTestEvidence(String testCategory, String testType,
			QualityLevel testEvidenceQualityLevel, EvidenceWeight weight,
			int cardinality) {
		super();
		this.testCategory = testCategory;
		this.testType = testType;
		this.testEvidenceQualityLevel = testEvidenceQualityLevel;
		this.weight = weight;
		this.cardinality = cardinality;
	}
	
	public EMatchMakerTestEvidence(){}
	
}
