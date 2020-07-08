export class Convention{
  id: string ;
  dateEditionConvention: Date;
  dateExpirationConvention: Date ;
  dateVigueurConvention: Date;
  objet: string ;
  type: string;
  constructor(
    id: string ,
    dateEditionConvention: Date,
    dateExpirationConvention: Date ,
    dateVigueurConvention: Date,
    objet: string ,
    type: string
    ){}
}
