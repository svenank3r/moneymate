import {NgModule} from '@angular/core';
import {NavigationModule} from './navigation/navigation.module';
import {MainNavigationComponent} from './navigation/components/main-navigation/main-navigation.component';
import {NotFoundComponent} from './navigation/components/not-found/not-found.component';
import {RouterModule} from '@angular/router';
import {RoutingModule} from './routing/routing.module';

@NgModule({
    declarations: [],
    imports: [
        NavigationModule,
        RouterModule,
    ],
    providers: [],
    exports: [
        MainNavigationComponent,
        NotFoundComponent,
        RoutingModule,
    ]
})
export class CoreModule {
}
