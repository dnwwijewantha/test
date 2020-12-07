package OnlineCoffeeShop.Entity;


	import javax.persistence.Column;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	public class CoppyShopWorkers {
		
		public CoppyShopWorkers(String firstName, String lastName, String email, String address) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.address = address;
		}

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id; 

		@Column(name = "first_name")
		private String firstName;
		
		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "address")
		private String address;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	}


