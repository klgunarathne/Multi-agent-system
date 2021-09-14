import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LayoutComponent } from './layout.component';

const routes: Routes = [
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: 'customer',
        loadChildren: () => import('../../components/customer/customer.module').then(m => m.CustomerModule)
      },
      {
        path: 'farmer',
        loadChildren: () => import('../../components/farmer/farmer.module').then(m => m.FarmerModule)
      },
      {
        path: 'seller',
        loadChildren: () => import('../../components/seller/seller.module').then(m => m.SellerModule)
      },
      {
        path: 'transpoter',
        loadChildren: () => import('../../components/transporter/transporter.module').then(m => m.TransporterModule)
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LayoutRoutingModule { }
