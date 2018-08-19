package pkg.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the items database table.
 * 
 */
@Entity
@Table(name="items")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String description;

	@Column(name="image_path")
	private String imagePath;

	private String name;

	private Integer price;

	@Column(name="seller_id")
	private Integer sellerId;
	
	public Item() {
	}

	public Item(String description, String imagePath,
			String name, Integer price, Integer sellerId) {
		setDescription(description);
		setImagePath(imagePath);
		setName(name);
		setPrice(price);
		setSellerId(sellerId);
	}

	public Integer getId() {
		return this.id;
	}

	/*public void setId(Integer id) {
		this.id = id;
	}*/

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

}