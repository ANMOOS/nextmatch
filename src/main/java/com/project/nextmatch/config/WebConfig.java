package com.project.nextmatch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 이 클래스가 설정(Configuration) 파일임을 명시합니다.
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // 1. CORS를 적용할 매핑 패턴 (모든 /api 경로에 적용)
                .allowedOrigins("http://localhost:3000") // 2. 허용할 출처 (React 개발 서버 포트)
                // 만약 프론트엔드 포트가 변경될 가능성이 있다면, allowedOrigins("*")로 설정할 수도 있으나, 보안상 권장되지 않습니다.
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 3. 허용할 HTTP 메서드
                .allowedHeaders("*") // 4. 모든 헤더 허용
                .allowCredentials(true) // 5. 쿠키와 같은 인증 정보 교환 허용
                .maxAge(3600); // 6. 캐싱 시간 (초 단위)
    }
}