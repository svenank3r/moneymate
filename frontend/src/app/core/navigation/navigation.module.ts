import {NgModule} from '@angular/core';

import {MatButtonModule, MatIconModule, MatListModule, MatSidenavModule, MatToolbarModule,} from '@angular/material';
import {MainNavigationComponent} from './components/main-navigation/main-navigation.component';
import {BrowserModule} from '@angular/platform-browser';
import {NotFoundComponent} from './components/not-found/not-found.component';
import {RouterModule} from '@angular/router';
import {FlexLayoutModule} from '@angular/flex-layout';
import { MatMenuModule } from '@angular/material/menu';

@NgModule({
    declarations: [
        MainNavigationComponent,
        NotFoundComponent,
    ],
    imports: [
        BrowserModule,
        FlexLayoutModule,
        MatSidenavModule,
        MatToolbarModule,
        MatIconModule,
        MatListModule,
        MatButtonModule,
        MatIconModule,
        RouterModule,
        MatMenuModule,
    ],
    providers: [],
    exports: [
        MainNavigationComponent,
        NotFoundComponent,
    ]
})
export class NavigationModule {
}
