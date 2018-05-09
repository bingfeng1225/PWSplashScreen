//
//  PWSplashScreen.h
//  PWSplashScreen
//
//  Created by Nick on 2018/5/7.
//  Copyright © 2018年 hisense. All rights reserved.
//
#if __has_include(<React/RCTAssert.h>)
#import <React/RCTBridgeModule.h>
#else
#import "RCTBridgeModule.h"
#endif

@interface PWSplashScreen : NSObject <RCTBridgeModule>
+ (void)show;
+ (void)hide;
@end
