export interface Transporter {
  id: number;
  items: string;
  gethering_point: string;
  destination_point: string;
  date: Date;
  price: number;
  quantity: number;
}
