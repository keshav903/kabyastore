

export class ItemDetail {
  itemId: string;
  name: string;
  brand: Brand;
  applianceType: ApplianceType;
  price: number;

}
enum Brand {
  APPLE,
  BOSCH,
  HITACHII,
  LG,
  SONY,
  TATA,
  SAMSUNG
}

enum ApplianceType {
  KITCHEN,
  GARDEN,
  LUXURY,
  PERSONAL,
  OFFICE
}

