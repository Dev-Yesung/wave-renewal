package com.wave.modulith.music.model.entity.music;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.wave.common.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Music")
@Entity
public class MusicEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// 음원 정보 메타데이터(ID3, Vorbis Comment 참고)
	private String title;
	private String album;
	private MusicGenreType genre;
	private LocalDate releaseDate;
	private int trackNumber;
	private String artist;
	private String composer;
	private String description;

	// 음원 파일 원본 메타데이터
	private String fileName;
	private String filePath;
	private AudioFileExtensionType fileExtension;
	private Long fileSizeBytes;
	private Long bitRateBps;
	private Long sampleRateHertz;
	private AudioChannelType channelType;
	private AudioCodecType codecType;
	private AudioMediaType mediaType;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private boolean isDeleted;

	// todo: EncodedMusicEntity 와 1:N 관계로 설계할 것 -> 이 두 엔티티는 데이터의 라이프 사이클이 동일함
	// todo: 음원과 사용자, 게시글, 앨범아트와의 연관관계가 필요함
}
